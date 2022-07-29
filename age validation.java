
/*Program to input age from user and throw user-defined exception if entered age is negative
In this program, we have created an exception class AgeException which extends the built-in Exception class. 
In main method, we read the input from user using Scanner after that we check the age in try block.
If it is less than 18 then it will throw an exception other it will display message "Valid age".*/

package exception_project;

import java.util.Scanner;

public class age_valid {
	Scanner s = new Scanner(System.in);
	  int age;
//main class
public static void main(String[] args) {
	age_valid obj=new age_valid();
	obj.age();
}
//creating age class
	public void age()
{
	// try catch for check the age validation
	  try {
		  System.out.print("Enter your age : ");
		   age = s.nextInt();
		   
		check_age(age);
	  }
	  catch (ArithmeticException e) {
	   System.out.println(e);
	  }
	 }
	//class created to check the age
	public void check_age(int b) 
	 {
		 if(b < 18)   
		 {
			 throw new ArithmeticException("\n Invalid age ...."
			 		+ "\n age should be greater than 18"); // throw exception for invalid age
			
		 }
		 else
		 {
			 throw new ArithmeticException("valid age...."); // throw exception for valid age
		 }
	 }
	
}