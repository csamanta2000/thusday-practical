class q2
{
        private String name;
        private int regNumber;
        public student(String n, int reg)
        {
                this.name = n;
                this.regNumber = reg;
        }
        public String getName()
        {
                return name;
        }
        public void setName(String name)
        {
                this.name = name;
        }
        public int getReg()
        {
                return regNumber;
        }
        public void setReg(int regNumber)
        {
                this.regNumber = regNumber;
        }
        public String toString()
        {
                return "Student Name: "+this.name+", Reg Number: "+this.regNumber;  
        }
}


import java.util.*;
class StudCompare implements Comparator<student>
{
        @Override
                public int compare(student stud1, student stud2)
        {
                if (stud1.getReg() < stud2.getReg())
                {
                        return 1;
                }
                return -1;
        }
}
class SortList
{
        public static void main(String[] args)
        {
                LinkedList<student> list = new LinkedList<student>();
                list.add(new student("John", 1001));
                list.add(new student("Raju", 1005));
                list.add(new student("Sham", 1000));
                list.add(new student("Ravi", 1002));
                Collections.sort(list, new StudCompare());
                System.out.println("Sorted list based on registration number\n");
                System.out.println("**=============**=================**");
                for (student stud: list )
                {
                        System.out.println(stud);
                }
                System.out.println("**=============**=================**\n");
        }
}