import java.io.*;

public class LaunchFr 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		FileReader reader=null;
		String path1="D:\\Telusko\\InputOutput";
		
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			reader=new FileReader(file);
//			int i=reader.read();
//			while(i!=-1)
//			{
//				System.out.println(i + " --> " + (char)i);
//				i=reader.read();
//			}
			char c=(char) reader.read();
			System.out.println(c);
			int size=(int) file.length();
			System.out.println(size);
			char cArray[]=new char[size];
			
			reader.read(cArray);
			for(char cr:cArray)
			{
				System.out.println(cr);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Some exception w.r.t IO");
		}
		finally
		{
			reader.close();
		}

	}

}
