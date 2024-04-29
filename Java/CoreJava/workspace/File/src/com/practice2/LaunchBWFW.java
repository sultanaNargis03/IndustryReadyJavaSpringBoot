package com.practice2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchBWFW {

	public static void main(String[] args) 
	{
		String path1="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO";
		FileWriter writer=null;
		BufferedWriter bw=null;
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
			
		}
		catch(Exception e)
		{
			
		}
		finally 
		{
			try 
			{
				writer.close();
				bw.close();
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
	}

}
