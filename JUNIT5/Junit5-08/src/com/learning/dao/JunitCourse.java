package com.learning.dao;

public class JunitCourse implements Course 
{

	@Override
	public boolean coursePurchased() 
	{
		System.out.println("Junit purchased successfully!!");
		return true;
	}	

}
