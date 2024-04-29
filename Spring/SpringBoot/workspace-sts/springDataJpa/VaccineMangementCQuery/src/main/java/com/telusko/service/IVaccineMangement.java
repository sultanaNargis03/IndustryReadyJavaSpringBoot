package com.telusko.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.telusko.bo.VaccineDetails;

public interface IVaccineMangement 
{
	public List<VaccineDetails> fetchVaccineByCompanyName(String company);
	public List<VaccineDetails> fetchVaccineByCompanies(String comp1,String comp2);
	public List<String> fetchVaccineByPriceRange(Integer min,Integer max);
	public List<Object[]> fetchVaccineDetailsByVaccineName(String vac1,String vac2);
	public int changePriceByVaccine(Integer newPrice,String vaccineName);
	public int deleteVaccineByPriceRange(Integer min,Integer max);
	public int insertVaccines(String vaccineName,String vaccineCompany,Integer price);
	public Date getSystemDateAndTime();

}		
