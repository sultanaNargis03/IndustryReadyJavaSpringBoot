package com.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchBWFW {

	public static void main(String[] args) 
	{

		FileWriter writer=null;
		BufferedWriter bw=null;
		String path1="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO";
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			 writer=new FileWriter(file);
			 bw=new BufferedWriter(writer);
			
			bw.write("Alien");
			bw.newLine();
			bw.write(65);
			bw.write("java");
			bw.flush();
			System.out.println("Check java.txt file");
	
				
		}
		catch(Exception e)
		{
			System.out.println("Some exception w.r.t IO");
		}
		
		finally
		{
			try {
				writer.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
