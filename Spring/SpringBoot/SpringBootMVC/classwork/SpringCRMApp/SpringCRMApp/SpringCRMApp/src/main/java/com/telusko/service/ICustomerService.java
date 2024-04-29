package com.telusko.service;

import java.util.List;

import com.telusko.model.CustomerInfo;

public interface ICustomerService 
{
	public List<CustomerInfo> getCustomers();
	public void registerCustomer(CustomerInfo customer);
	public void deleteCx(Integer id);
	public CustomerInfo getCx(Integer id);

}
