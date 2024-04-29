package com.telusko.beans;

public class Amazon {

	CourierService service;
	public Amazon() 
	{
		System.out.println("Amazon obj is created");
	}
	
	public CourierService getService() {
		return service;
	}

	public void setService(CourierService service) {
		this.service = service;
	}

	public boolean initiateDelivery(double amount)
	{
		
		return service.courierService(amount);
	}

}
