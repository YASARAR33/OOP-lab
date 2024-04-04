import java.util.*;
class Employee
{
	int empid;
	String name;
	double salary;
	String address;
	Employee()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter employee id:");
		empid=sc2.nextInt();
		System.out.println("Enter employee name:");
		name=sc2.next();
		System.out.println("Enter employee salary:");
		salary=sc2.nextDouble();
		
		System.out.println("Enter employee address:");
		address=sc2.next();
	}
}
class Teacher extends Employee
{
	String department;
	String subject;
	Teacher()
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter department:");
		department=sc3.next();
		System.out.println("Enter subject:");
		subject=sc3.next();
	}
	void display()
	{
		System.out.println(".......................");
		System.out.println("Id:"+empid);
		System.out.println("NAME:"+name);
		System.out.println("SALARY:"+salary);
		System.out.println("ADDRESS:"+address);
		System.out.println("DEPARTMENT:"+department);
		System.out.println("SUBJECT:"+subject);
	}
}
class MultilevelInheritance
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
