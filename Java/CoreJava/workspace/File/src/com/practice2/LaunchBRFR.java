package com.practice2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchBRFR {

	public static void main(String[] args) 
	{
		
		String path1="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO";
		FileReader reader=null;
		BufferedReader br=null;
		try 
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			reader=new FileReader(file);
			br=new BufferedReader(reader);
			
			String str=br.readLine();
			while(str!=null)
			{
				System.out.println(str);
				str=br.readLine();
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
