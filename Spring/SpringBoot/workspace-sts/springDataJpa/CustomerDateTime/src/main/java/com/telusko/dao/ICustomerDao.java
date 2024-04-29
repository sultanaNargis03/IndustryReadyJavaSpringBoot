package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.CustomerDetails;

public interface ICustomerDao extends CrudRepository<CustomerDetails, Integer> 
{

}
