package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.bo.VaccineDetails;
import com.telusko.dao.IVaccineRepo;

@Service
public class VaccineMangementImpl implements IVaccineMangement 
{
	@Autowired
	private IVaccineRepo repo;


	@Override
	public Iterable<VaccineDetails> fetchDetails(boolean status, String... properties) {
		
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		
		return repo.findAll(sort);
	}


	@Override
	public List<VaccineDetails> fetchDetailsByPgNo(int pgNo, int pgSize, boolean status, String... properties) {
		PageRequest pageable = PageRequest.of(pgNo, pgSize, status?Direction.ASC:Direction.DESC, properties);
		Page<VaccineDetails> page = repo.findAll(pageable);
		List<VaccineDetails> list = page.getContent();
		return list;
	}


	@Override
	public void fetchDetailsByPagination(int pageSize) 
	{
		long count=4l;
		long pagesCount=count/pageSize; // 4/2==2 ,6/2==>3
		pagesCount=count%pageSize==0?pagesCount:++pagesCount;
		
		for(int i=0;i<pagesCount;i++)
		{
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page<VaccineDetails> page = repo.findAll(pageable);
			page.getContent().forEach((c)->System.out.println(c.getVaccineName()+" "+c.getVaccineCompany()));
			System.out.println("Total no of pages : "+page.getTotalPages());
		}
		
	}


}
