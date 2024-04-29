package com.practice1;

import java.io.*;

public class LaunchFR {

	public static void main(String[] args) 
	{
		
		String path1="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO";
		FileReader reader=null;
		try 
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			reader=new FileReader(file);
			int size=(int) file.length();
			char cArray[]=new char[size];
			
			reader.read(cArray);
			for(char c:cArray)
			{
				System.out.print(c+" ");
			}
			
			
		}
		catch(Exception e)
		{
			
		}
		finally 
		{
			try 
			{
				reader.close();
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
	}

}
