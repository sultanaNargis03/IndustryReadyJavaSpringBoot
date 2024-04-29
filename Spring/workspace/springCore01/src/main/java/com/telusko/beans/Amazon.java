package com.telusko.beans;

public class Amazon 
{
	private DeliveryService service;
	
	static
	{
		System.out.println("Amazon class is loaded");
	}
	
	
	public Amazon(DeliveryService service) {
		
		this.service = service;
	}

	public DeliveryService getService() {
		return service;
	}

	public void setService(DeliveryService service) {
		this.service = service;
	}

	public boolean initiateDelivery(double amount)
	{
		
		return service.courierService(amount);
	}
}
