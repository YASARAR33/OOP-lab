import java.util.*;
interface areaperi
{
	void area();
	void perimeter();
}
class Rectangle implements areaperi
{
	int l=10,b=20;
	public void area()
	{
		System.out.println("Area of Rectangle:"+l*b);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle:"+(2*(l+b)));
	}
}
class Circle implements areaperi
{
	int r=10;
	public void area()
	{
		System.out.println("Area of Circle:"+3.14*r*r);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Cirlce:"+2*3.14*r);
	}
}
class InterfaceExample
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		int ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Circle,2 for rectangle:");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				c.area();
				c.perimeter();
				break;
			case 2:
				r.area();
				r.perimeter();
				break;
		}
	}
}	
