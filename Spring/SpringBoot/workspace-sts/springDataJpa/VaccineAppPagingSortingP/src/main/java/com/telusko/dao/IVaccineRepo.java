package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends PagingAndSortingRepository<VaccineDetails, Long> 
{

}
