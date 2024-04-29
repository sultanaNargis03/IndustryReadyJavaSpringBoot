package com.telusko.beans;

public class BlueDart implements CourierService
{
	
	public BlueDart() 
	{
		System.out.println("Bd object created");
	}

	@Override
	public boolean courierService(double amount) 
	{
		System.out.println("Courier delivered through BlueDart and amount paid is "+amount);
		return true;
	}

}