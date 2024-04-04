import java.io.*;
import java.util.*;
class FileNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String file1,odd,even;
			System.out.println("Enter the file name from which to be copied:");
			file1=sc.next();
			FileReader reader=new FileReader(file1);
			BufferedReader br=new BufferedReader(reader);
			String line;
			System.out.println("Enter two file names:");
			odd=sc.next();
			even=sc.next();
			FileWriter writer1=new FileWriter(odd,true);
			FileWriter writer2=new FileWriter(even,true);
			while((line=br.readLine())!=null)
			{
				int nline=Integer.parseInt(line);
				if(nline%2!=0)
				{
					writer1.write(line+"\n");
				}
				else
				{
					writer2.write(line+"\n");
				}
			}
			System.out.println("Data copied to new file");
			reader.close();
			writer1.close();
			writer2.close();
		}
		catch(IOException e)
		{
			System.out.println("Error occured");
		}
	}
}
