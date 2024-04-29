package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> 
{
	//findByProperty
	public List<VaccineDetails> findByVaccineCompany(String companyName);
	public List<VaccineDetails> findByPrice(Integer price);
}
