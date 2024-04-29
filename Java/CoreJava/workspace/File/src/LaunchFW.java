import java.io.*;

public class LaunchFW 
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter writer=null;
		String path1="D:\\Telusko\\InputOutput";
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			 writer=new FileWriter(file);
			
			writer.write("Java");
			writer.write("\n");
			writer.write(65);
			
			char carray[]= {'j', 'a','v','a'};
			writer.write(carray);
			
			System.out.println("Check java.txt file");
	
				
		}
		catch(Exception e)
		{
			System.out.println("Some exception w.r.t IO");
		}
		
		finally
		{
			writer.close();
		}

	}

}
