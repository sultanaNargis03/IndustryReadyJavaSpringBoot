import java.io.*;
public class LaunchFile1 
{
	public static void main(String[] args) 
	{
		String path1="D:\\Telusko\\InputOutput\\java.txt";
		String path2="D:\\Telusko\\InputOutput\\Java";
		try
		{
		File file1=new File(path1);
		//System.out.println(file1.createNewFile()); if file is present it will not create new file
		System.out.println(file1.exists());//true
		System.out.println(file1.isFile());//true
		System.out.println(file1.isDirectory());//false
		
		System.out.println(file1.getPath());
		
		File directory=new File(path2);
		
		System.out.println(directory.mkdir());
		
		System.out.println(directory.exists());//true
		System.out.println(directory.isFile());//false
		System.out.println(directory.isDirectory());//true
		System.out.println("*************************************");
		File file2=new File("D:\\trial\\IO\\src");
		
		String ar[]=file2.list();
		int count=0;
		for(String files:ar)
		{
			count++;
			System.out.println(files);
		}
		System.out.println("The number files in that direcotry is : "+ count);
		
		}
		catch(Exception e)
		{
			System.out.println("Some exception");
		}

	}

}
