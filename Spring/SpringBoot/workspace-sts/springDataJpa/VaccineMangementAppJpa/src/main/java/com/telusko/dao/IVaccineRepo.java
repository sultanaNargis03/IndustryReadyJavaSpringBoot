package com.telusko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> 
{

}
