import java.util.*;
class User
{
public static void main(String args[])
{
String username,password;
Scanner sc=new Scanner(System.in);
System.out.println("enter username:");
username=sc.nextLine();
System.out.println("enter password:");
password=sc.nextLine();
try
{
if(username.equals("admin") && password.equals("123"))
{
System.out.println("authentication successful");
}
else
{
System.out.println("authentication failed");
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
