package com.practice1;
import java.io.*;
public class LaunchFile1 {

	public static void main(String[] args) 
	{
		String path1="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO\\java.txt";
		String path2="D:\\IndustryReadyJava\\Java\\CoreJava\\File\\IO\\Java";
		try 
		{
			File file1=new File(path1);
			
			System.out.println(file1.createNewFile());//if file is present it will not create again
			System.out.println(file1.exists());//true
			System.out.println(file1.isDirectory());//false
			System.out.println(file1.isFile());//true
			System.out.println(file1.getPath());
			System.out.println("*************************");
			File directory =new File(path2);
			System.out.println(directory.mkdir());
			System.out.println(directory.exists());//true
			System.out.println(directory.isDirectory());//true
			System.out.println(directory.isFile());//false
			System.out.println(directory.getPath());
			
		} 
		catch (IOException e) 
		{
			System.out.println("some Exception");
		}
		

	}

}
