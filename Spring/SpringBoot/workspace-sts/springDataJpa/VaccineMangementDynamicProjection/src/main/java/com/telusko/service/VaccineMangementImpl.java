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
import com.telusko.view.View;

@Service
public class VaccineMangementImpl implements IVaccineMangement 
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public <T extends View> List<T> fetchByVaccineCompany(String companyName, Class<T> cls) {
		
		return repo.findByVaccineCompany(companyName, cls);
	}

	

}
