package com.telusko.service;

import com.telusko.beans.CourierService;

public class FirstFlight implements CourierService
{
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
