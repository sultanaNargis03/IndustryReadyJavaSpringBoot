package com.telusko.beans;

public class BlueDart implements DeliveryService
{
	static
	{
		System.out.println("BD class is loaded");
	}
	
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