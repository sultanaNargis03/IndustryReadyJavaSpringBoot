package com.practice2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LaunchPW {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String path1="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO";
		
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			PrintWriter print=new PrintWriter(file);
			
			print.println(14);
			print.println(44.5);
			print.println("Java");
			print.close();
			
	}

}
