package com.practice1;

import java.io.*;

public class LaunchFW {

	public static void main(String[] args) 
	{
		
		String path1="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO";
		FileWriter writer=null;
		try 
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			writer=new FileWriter(file);
			
			writer.write("Java");
			writer.write("\n");
			writer.write(65);
			char carry[]= {'j','a','v','a'};
			writer.write("\n");
			writer.write(carry);
			
			
		}
		catch(Exception e)
		{
			
		}
		finally 
		{
			try 
			{
				writer.close();
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
		
	}

}
