package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.ResultView;
import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> 
{
	//findByProperty
	public List<ResultView> findByPriceLessThan(Integer price);

}
