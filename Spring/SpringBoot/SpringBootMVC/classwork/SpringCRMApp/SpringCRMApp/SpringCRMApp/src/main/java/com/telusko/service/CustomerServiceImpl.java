package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.ICustomerDao;
import com.telusko.model.CustomerInfo;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao repo;
	
	@Override
	public List<CustomerInfo> getCustomers() 
	{
		return (List<CustomerInfo>) repo.findAll();
		
	}

	@Override
	public void registerCustomer(CustomerInfo customer) {
		repo.save(customer);
		
	}

	@Override
	public void deleteCx(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public CustomerInfo getCx(Integer id) {
		Optional obj=repo.findById(id);
		return (CustomerInfo) obj.get();
	}

}
