package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.VaccineInfo2;

public interface IVaccineRepo extends CrudRepository<VaccineInfo2, Long>
{
	
}
