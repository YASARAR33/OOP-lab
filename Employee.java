import java.util.*;
class Employee
{
	int eno;
	String ename;
	int esalary;
	Scanner sc=new Scanner(System.in);
	void getdetails()
	{
		System.out.println("Enter eno:");
		this.eno=sc.nextInt();
		System.out.println("Enter ename:");
		this.ename=sc.next();
		System.out.println("Enter esalary:");
		this.esalary=sc.nextInt();
	}
	void display()
	{
		System.out.println("Employee no:"+this.eno);
		System.out.println("Employee name:"+this.ename);
		System.out.println("Employee salary:"+this.esalary);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee[] a1=new Employee[5];
		int f=0,i;
		for(i=0;i<5;i++)
		{
			a1[i]=new Employee();
			a1[i].getdetails();
		}
		System.out.println("Enter the id to be searched:");
		int id=sc.nextInt();
		for(i=0;i<5;i++)
		{
			if(id==a1[i].eno)
			{
				a1[i].display();
				f=0;
				break;
			}
			else
			{
				f++;
			}
		}
		if(f!=0)
			System.out.println("No match is found");
	}
}
