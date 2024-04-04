import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
interface calc
{
	void total();
}
class Product1 implements calc
{
	int pid=101,qty=2,pr=25,total;
	String name="Apple";
	public void total()
	{
		total=qty*pr;
	}
}
class Product2 extends Product1 implements calc
{
	int p_id=102,qnty=1,_pr=100,totl;
	String nam="Banana";
	DateFormat df=new SimpleDateFormat("dd/mm/yy");
	Date d=new Date();
	public void total()
	{
		super.total();
		totl=qnty*_pr;
	}
	void display()
	{
		System.out.println("Order no.56\n");
		System.out.println("Date:"+df.format(d));
		System.out.println("\nProduct Id\t\tName\t\tQunatity\t\tunit price\t\tTotal");
		System.out.println("_______________________________________________________________________________________________");
		System.out.println(pid+"\t\t"+name+"\t\t"+qty+"\t\t"+pr+"\t\t"+total);
		System.out.println(p_id+"\t\t"+nam+"\t\t"+qnty+"\t\t"+_pr+"\t\t"+totl);
		System.out.println("_______________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\tNet.Amount\t\t\t"+(total+totl));
	}
}
class Bill
{
	public static void main(String args[])
	{
		Product1 p1=new Product1();
		Product2 p2=new Product2();
		p1.total();
		p2.total();
		p2.display();
	}
}
