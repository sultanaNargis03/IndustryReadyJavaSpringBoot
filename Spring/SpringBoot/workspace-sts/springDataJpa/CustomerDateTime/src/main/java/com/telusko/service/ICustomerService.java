package com.telusko.service;

import java.util.List;

import com.telusko.bo.CustomerDetails;

public interface ICustomerService 
{
	public String registerCustomer(CustomerDetails customer);
	public List<CustomerDetails> getAllCustomer();
	
}
