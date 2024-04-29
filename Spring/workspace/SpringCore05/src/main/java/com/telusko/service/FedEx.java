package com.telusko.service;

import com.telusko.beans.CourierService;

public class FedEx implements CourierService
{
	public FedEx() 
	{
		System.out.println("Fedex object created");
	}
	@Override
	public boolean courierService(double amount) 
	{
		System.out.println("Courier delivered through FedEx and amount paid is "+amount);
		return true;
	}
}
