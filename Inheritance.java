import java.util.*;
class Person
{
	String pname;
	String gender;
	String address;
	int age;
	Person()
	{
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter Name::");
		pname=sc4.next();
		System.out.println("Enter Gender:");
		gender=sc4.next();
		System.out.println("Enter Address:");
		address=sc4.next();
		System.out.println("Enter Age:");
		age=sc4.nextInt();
	}
}
class Employee extends Person
{
	int empid;
	String cname;
	String qualification;
	double salary;
	Employee()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		empid=sc2.nextInt();
		System.out.println("Enter Employee Company Name:");
		cname=sc2.next();
		System.out.println("Enter Employee Qualification:");
		qualification=sc2.next();
		System.out.println("Enter Employee Salary:");
		salary=sc2.nextDouble();
		
		
	}
}
class Teacher extends Employee
{
	String subject;
	String department;
	int tid;
	Teacher()
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter Subject:");
		subject=sc3.next();
		System.out.println("Enter Department:");
		department=sc3.next();
		System.out.println("Enter Teacher Id:");
		tid=sc3.nextInt();
	}
	void display()
	{
		System.out.println(".......................");
		System.out.println("NAME:"+pname);
		System.out.println("GENDER:"+gender);
		System.out.println("ADDRESS:"+address);
		System.out.println("AGE:"+age);
		System.out.println("Id:"+empid);
		System.out.println("COMAPNY NAME:"+cname);
		System.out.println("QUALIFICATION:"+qualification);
		System.out.println("SALARY:"+salary);
		System.out.println("SUBJECT:"+subject);
		System.out.println("DEPARTMENT:"+department);
		System.out.println("TEACHER ID:"+tid);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		int n;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter number of employees:");
		n=sc1.nextInt();
		Teacher t[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			t[i]=new Teacher();
		}
		System.out.println("....................");
		System.out.println("....................");
		System.out.println("The Details are...");
		System.out.println("....................");
		for(int i=0;i<n;i++)
		{
			t[i].display();
		}
	}
}
