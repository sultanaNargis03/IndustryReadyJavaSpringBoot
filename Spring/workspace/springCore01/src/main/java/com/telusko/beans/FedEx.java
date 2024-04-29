package com.telusko.beans;

public class FedEx implements DeliveryService
{

	static
	{
		System.out.println("Amazon class is loaded");
	}
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