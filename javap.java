import java.util.*;
class Student
{
	 String name;
	 int sid,eng,math;
	 Student()
	 {
	 	Scanner x=new Scanner(System.in);
	 	System.out.println("enter Name:");
	 	name=x.next();
	 	System.out.println("Enter student Id:");
	 	sid=x.nextInt();
	 	System.out.println("Enter Marks in English:");
	 	eng=x.nextInt();
	 	System.out.println("Enter Marks in Maths:");
	 	math=x.nextInt();
	 }
}
class Sports extends Student
{
	String rank;
	Sports()
	{
		Scanner y=new Scanner(System.in);
		System.out.println("Enter rank:");
		rank=y.next();
	}
}
class Result extends Sports
{
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Sid:"+sid);
		System.out.println("***Academic***");
		System.out.println("English:"+eng);
		System.out.println("Maths:"+math);
		System.out.println("***Sports***");
		System.out.println("Sports rank:"+rank);
		
	}
}
class javap
{
	public static void main(String args[])
	{
		Result student=new Result();
		student.display();
	}
}
