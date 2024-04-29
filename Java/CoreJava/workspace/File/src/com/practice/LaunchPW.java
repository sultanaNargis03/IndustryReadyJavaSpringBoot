package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LaunchPW {

	public static void main(String[] args) throws FileNotFoundException 
	{

		File file=new File("D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO");
		File file1=new File(file,"java.txt");
		
		PrintWriter print=new PrintWriter(file1);
		print.println(true);
		print.println(44.5);
		print.println(14);
		print.println("java");
		print.println("A");
		
		print.close();

	}

}
