package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.model.CustomerInfo;

public interface ICustomerDao extends CrudRepository<CustomerInfo, Integer> 
{
	

}
