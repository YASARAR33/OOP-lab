import java.io.*;
import java.util.*;
class FileCopy
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{	
			String file1,file2;
			System.out.println("Enter the file name from which to be copied:");
			file1=sc.next();
			FileReader reader=new FileReader(file1);
			BufferedReader br=new BufferedReader(reader);
			String line;
			System.out.println("Enter the name of new file:");
			file2=sc.next();
			FileWriter writer=new FileWriter(file2,true);
			while((line=br.readLine())!=null)
			{
				writer.write(line+"\n");
			}
			System.out.println("Data copied to new file");
			reader.close();
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println("Error occured");
		}
	}
}
