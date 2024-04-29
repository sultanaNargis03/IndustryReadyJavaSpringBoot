package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.bo.VaccineDetails;
import com.telusko.dao.IVaccineRepo;

@Service
public class VaccineMangementImpl implements IVaccineMangement 
{
	@Autowired
	private IVaccineRepo repo;

	//@Override
	public List<VaccineDetails> searchByVaccineCompany(String companyName) {
		
		
		return repo.findByVaccineCompany(companyName);
	}

	@Override
	public List<VaccineDetails> searchByPrice(Integer price) 
	{
		
		return repo.findByPrice(price);
	}
	


}
