package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.CustomerDetails;
import com.telusko.dao.ICustomerDao;

@Service
public class ICustomerServiceImpl implements ICustomerService 
{
	@Autowired
	ICustomerDao repo;

	@Override
	public String registerCustomer(CustomerDetails customer) {
		
		repo.save(customer);
		return "customer details regisger with id "+customer.getCid();
				
	}

	@Override
	public List<CustomerDetails> getAllCustomer()
	{
		List<CustomerDetails> list=(List<CustomerDetails>) repo.findAll();
		
		return list;
	}

	
}
