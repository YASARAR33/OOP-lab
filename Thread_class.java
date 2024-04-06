import java.io.*;
class ThreadA extends Thread
{
	public void run()
	{
		System.out.println("Multiple of 5 are:");
		for(int k=1;k<=100;k++)
		{
			if(k%5==0)
			{
				System.out.println(k+" ");
			}
		}
	}
}
class ThreadB extends Thread
{
	public void run()
	{
		int i=1,num=0;
		String primeNumbers="";
		{
			for(i=1;i<=100;i++)
			{
				int counter=0;
				for(num=i;num>=1;num--)
				{
					if(i%num==0)
					{
						counter=counter+1;
					}
				}
				if(counter==2)
				{	
					primeNumbers=primeNumbers+i+" ";
				}
			}
			System.out.println("Prime numbers from 1 to 100 are:");
			System.out.println(primeNumbers);
		}
	}
}
public class Thread_class
{
	public static void main(String args[]) throws InterruptedException
	{
		ThreadA t1=new ThreadA();
		ThreadB t2=new ThreadB();
		t1.start();
		ThreadA.sleep(1000);
		t2.start();
		ThreadB.sleep(1000);
	}
}
