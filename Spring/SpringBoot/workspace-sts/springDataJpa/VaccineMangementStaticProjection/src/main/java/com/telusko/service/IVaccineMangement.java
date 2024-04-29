package com.telusko.service;

import java.util.List;
import java.util.Optional;

import com.telusko.ResultView;
import com.telusko.bo.VaccineDetails;

public interface IVaccineMangement 
{
	public List<ResultView> fetchByPriceLessThan(Integer price);
}		
