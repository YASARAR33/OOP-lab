import java.util.*;
import java.io.*;
import java.lang.*;
class fibonaci implements Runnable
{
	public void run()
	{
		int n=10,a=0,b=1,c=0;
		System.out.println("Fibancci Series:");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
	}
}
class even implements Runnable
{
	public void run()
	{
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Enter limit for even numbers:");
		N=sc.nextInt();
		System.out.println("Even numbers:");
		for(int i=0;i<=N;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
public class Runnable_thread
{
	public static void main(String args[]) throws InterruptedException
	{
		fibonaci t1=new fibonaci();
		Thread p=new Thread(t1);
		even t2=new even();
		Thread q=new Thread(t2);
		p.start();
		Thread.sleep(200);
		q.start();
		Thread.sleep(500);
	}
}
