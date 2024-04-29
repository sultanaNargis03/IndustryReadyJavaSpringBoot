package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchBWFR {

	public static void main(String[] args) {

		FileReader reader=null;
		BufferedReader br=null;
		String path1="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO";
		
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
			System.out.println("Some exception w.r.t IO");
		}
		finally
		{
			try {
				reader.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
