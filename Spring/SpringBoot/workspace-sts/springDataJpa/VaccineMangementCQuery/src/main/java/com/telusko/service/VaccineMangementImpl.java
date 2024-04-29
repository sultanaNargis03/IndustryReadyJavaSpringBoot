package com.telusko.service;

import java.util.Date;
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

	@Override
	public List<VaccineDetails> fetchVaccineByCompanyName(String company) {
		
		return repo.searchVaccineByCompanyName(company);
	}

	@Override
	public List<VaccineDetails> fetchVaccineByCompanies(String comp1, String comp2) {
		// TODO Auto-generated method stub
		return repo.searchVaccineByCompanies(comp1, comp2);
	}

	@Override
	public List<String> fetchVaccineByPriceRange(Integer min, Integer max) {
		// TODO Auto-generated method stub
		return repo.searchVaccineByPriceRange(min, max);
	}

	@Override
	public List<Object[]> fetchVaccineDetailsByVaccineName(String vac1, String vac2) {
		// TODO Auto-generated method stub
		return repo.searchVaccineDetailsByVaccineName(vac1, vac2);
	}

	@Override
	public int changePriceByVaccine(Integer newPrice, String vaccineName) 
	{
		
		return repo.updatePriceByVaccine(newPrice, vaccineName);
	}

	@Override
	public int deleteVaccineByPriceRange(Integer min, Integer max) {
		
		return repo.deleteVaccineByPriceRange(min, max);
	}

	@Override
	public int insertVaccines(String vaccineName, String vaccineCompany, Integer price) 
	{
		
		return repo.insertVaccineDetails(vaccineName, vaccineCompany, price);
	}

	@Override
	public Date getSystemDateAndTime() 
	{
		
		return repo.getTheSystemDateAndTime();
	}

}
