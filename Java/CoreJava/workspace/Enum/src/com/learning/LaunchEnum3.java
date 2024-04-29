package com.learning;

//This is an enum example
enum Result1
{
	PASS, FAIL, NR;
}

//CLASS JAVA

public class LaunchEnum3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int i=14;
		String data="Java";
		
		Result1 res=Result1.PASS;
		
		//this is example to check enum is compatable with switch case;;;;;;;
		switch(res)
		{
		  case PASS:System.out.println("Passed the exam");
		  break;
		  case FAIL:System.out.println("Failed in the exam");
		  break;
		  case NR:System.out.println("No results");
		}

	}

}
