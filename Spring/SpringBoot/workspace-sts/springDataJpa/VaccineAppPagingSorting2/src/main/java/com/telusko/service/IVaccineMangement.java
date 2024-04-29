package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.telusko.bo.VaccineDetails;

public interface IVaccineMangement 
{
	public Iterable<VaccineDetails>fetchDetails(boolean status,String... properties);
	public List<VaccineDetails>fetchDetailsByPgNo(int pgNo,int pgSize,boolean status,String...properties);
	public void fetchDetailsByPagination(int pageSize);
}
