import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchBWFW 
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter writer=null;
		BufferedWriter bw=null;
		String path1="D:\\Telusko\\InputOutput";
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			 writer=new FileWriter(file);
			 bw=new BufferedWriter(writer);
			
			bw.write("Alien");
			bw.newLine();
			bw.write(65);
			bw.write("Java");
			
			bw.flush();
			
			System.out.println("Check java.txt file");
	
				
		}
		catch(Exception e)
		{
			System.out.println("Some exception w.r.t IO");
		}
		
		finally
		{
			writer.close();
			bw.close();
		}


	}

}
