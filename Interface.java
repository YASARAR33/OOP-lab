interface AreaCalculate
{
	double calculateArea();
}
interface PerimeterCalculate
{
	double calculatePerimeter();
}
class Rectangle implements AreaCalculate,PerimeterCalculate
{
	double length;
	double width;
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double calculateArea()
	{
		return length*width;
		
	}
	public double calculatePerimeter()
	{
		return 2*(length+width);
	}
}
public class Interface
{
	public static void main(String[] args)
	{
		Rectangle rectangle=new Rectangle(5,8);
		System.out.println("Area:"+rectangle.calculateArea());
		System.out.println("Perimeter:"+rectangle.calculatePerimeter());
	}
}
