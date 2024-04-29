package com.telusko.service;

import java.util.List;
import java.util.Optional;


import com.telusko.bo.VaccineDetails;
import com.telusko.view.View;

public interface IVaccineMangement 
{
	public <T extends View>List<T> fetchByVaccineCompany(String companyName,Class<T>cls);

}		
