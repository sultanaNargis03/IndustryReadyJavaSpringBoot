public class Amazon 
{
	private DeliveryService service;
	
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
