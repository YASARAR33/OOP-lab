import java.util.*;
class StringMani
{
	public static void main(String args[])
	{
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("Length of string:"+str1.length());
		System.out.println("String endswith:"+str1.endsWith("g"));
		System.out.println("String contains 'oo':"+str1.contains("oo"));
		System.out.println("String in lowercase:"+str1.toLowerCase());
		System.out.println("String in uppercase:"+str1.toUpperCase());
		System.out.println("String replaced:"+str1.replaceAll("oo","li"));
	}
}
