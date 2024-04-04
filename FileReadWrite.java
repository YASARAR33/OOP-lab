import java.io.*;
import java.util.*;
class FileReadWrite
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		try
		{
			String file1;
			System.out.println("Enter the file name from which to be copied:");
			file1=sc.next();
			FileWriter writer=new FileWriter(file1,true);
			writer.write("Welcome");
			writer.close();
			FileReader reader=new FileReader(file1);
			BufferedReader br=new BufferedReader(reader);
			String line;
			System.out.println("Data read from the file");
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("Error Occured");
		}
	}
}	
