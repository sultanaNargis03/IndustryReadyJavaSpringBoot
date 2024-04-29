import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class Alien implements AutoCloseable
{
	@Override
	public void close() throws Exception 
	{
		
		System.out.println("Close method of alien resource is invocked");
	}
	
}

public class LaunchTwRes 
{

	public static void main(String[] args) throws Exception 
	{
		
		try(Alien a=new Alien())
		{
			
			System.out.println("Some body which using is using res");
		}
	
//		try(BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Telusko\\InputOutput\\java.txt")))
//		{
//	
//			
//			bw.write("Alien");
//			bw.newLine();
//			bw.write(65);
//			bw.write("Java");
//			
//			bw.flush();
//			
//			System.out.println("Check java.txt file");
//	
//				
//		}
//		catch(Exception e)
//		{
//			System.out.println("Some exception w.r.t IO");
//		}

	}

}
