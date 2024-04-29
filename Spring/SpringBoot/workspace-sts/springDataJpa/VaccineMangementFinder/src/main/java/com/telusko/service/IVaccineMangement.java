package com.telusko.service;

import java.util.List;
import java.util.Optional;

import com.telusko.bo.VaccineDetails;

public interface IVaccineMangement 
{
	
	public List<VaccineDetails> searchByVaccineCompany(String companyName);
	public List<VaccineDetails> searchByPrice(Integer price);
}		
