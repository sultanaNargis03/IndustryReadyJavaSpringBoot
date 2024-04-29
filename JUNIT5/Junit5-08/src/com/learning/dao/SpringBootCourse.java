package com.learning.dao;

public class SpringBootCourse implements Course 
{

	@Override
	public boolean coursePurchased() 
	{
		System.out.println("SpringBoot purchased successfully!!");
		return true;
	}

}
