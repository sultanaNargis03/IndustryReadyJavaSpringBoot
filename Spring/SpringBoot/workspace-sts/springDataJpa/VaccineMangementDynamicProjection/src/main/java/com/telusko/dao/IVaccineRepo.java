package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.bo.VaccineDetails;
import com.telusko.view.View;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> 
{
	public <T extends View>List<T> findByVaccineCompany(String companyName,Class<T>cls);

}
