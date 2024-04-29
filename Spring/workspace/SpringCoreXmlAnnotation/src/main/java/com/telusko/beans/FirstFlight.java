package com.telusko.beans;

public class FirstFlight implements CourierService
{
//	static
//	{
//		System.out.println("Amazon class is loaded");
//	}
	public FirstFlight() 
	{
		System.out.println("FF object created");
	}

	@Override
	public boolean courierService(double amount) 
	{
		System.out.println("Courier delivered through FirstFlight and amount paid is "+amount);
		return true;
	}

}   

