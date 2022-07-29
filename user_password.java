/*Write a program to accept User ID and  password checks if the password is valid or not based on password policies mention below:(Using exception Handling)
Password should not contain any space.
Password should contain at least one digit(0-9).
Password length should be between 8 to 15 characters.
Password should contain at least one lowercase letter(a-z).
Password should contain at least one uppercase letter(A-Z).
Password should contain at least one special character ( @, #, %, &, !, $, etc….).*/

package exception_project;

import java.util.Scanner;

public class user_password {
	String id,s; 
	private  String password,user_Id;
	
	static int pass_length=9;
	 Scanner sc= new Scanner(System.in);
	 //class for accepting the id from user
	public void accept() {
	
		System.out.println("Enter your user id :");
		user_Id=sc.next();
		password();
		
	}
	
	//  creating class for password
		public void password()
		{
			System.out.print("Password should not contain any space.\n"
					+ "Password should contain at least one digit(0-9).\n"
					+ "Password length should be between 0 to 9 characters.\n"
					+ "Password should contain at least one lowercase letter(a-z).\n"
					+ "Password should contain at least one uppercase letter(A-Z).\n"
					+ "Password should contain at least one special character ( @, #, %, &, !, $, etc….)."); 
	               s = sc.next();
	               
				try { // try catch for password
					if (is_Valid_Password(s)) {
			            System.out.println("Password is valid: " + s);
			            show();
			        } else {
			        	throw new Exception("Not a valid password: ");
			           }
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			
		}	
		// class for checking the condition for space
		public static boolean space(String password) {
		if (password.contains(" ")) { // condition for space
            return false;
		}
		return false;
		}
		// class for checking the condition for password length
			public static boolean is_Valid_Password(String password) {

		        if (password.length() < pass_length) return false;// condition for length of password

		        int charCount = 0;
		        int numCount = 0;
		        for (int i = 0; i < password.length(); i++) {
		            char ch = password.charAt(i);
		            if (is_Numeric(ch)) numCount++;// condition for number of password contain digit
		            else{ if (up_Letter(ch)) charCount++;
				}// condition for character are in upper case
		            else{ if (lo_Letter(ch)) charCount++;
				}// condition for character are in lower case
		            else {if((password.contains("@") || password.contains("#") // condition for special character
			                 || password.contains("!") || password.contains("~")
			                 || password.contains("$") || password.contains("%")
			                 || password.contains("^") || password.contains("&")
			                 || password.contains("*") || password.contains("(")
			                 || password.contains(")") || password.contains("-")
			                 || password.contains("+") || password.contains("/")
			                 || password.contains(":") || password.contains(".")
			                 || password.contains(", ") || password.contains("<")
			                 || password.contains(">") || password.contains("?")
			                 || password.contains("|")));
				 }
		            else return false; // character if nothing is true
		        }
		        return (charCount >= 2 && numCount >= 2);
		    }
			// class for checking the condition for password letter in capital letter
		    public static boolean up_Letter(char ch) {
		        ch = Character.toUpperCase(ch);
		        return (ch >= 'A' && ch <= 'Z');
		    }
			// class for checking the condition for password letter in small letter
		    public static boolean lo_Letter(char ch) {
		        ch = Character.toLowerCase(ch);
		        return (ch >= 'a' && ch <= 'z');
		    }

		 // class for checking the condition for password number
		    public static boolean is_Numeric(char ch) {

		        return (ch >= '0' && ch <= '9');
		    }
		   
		    // class to display the password and id 
		    public void show()
			{
				
				System.out.println("Your Id : "+user_Id);
				System.out.println("Your Password : "+password);
				
			}

}