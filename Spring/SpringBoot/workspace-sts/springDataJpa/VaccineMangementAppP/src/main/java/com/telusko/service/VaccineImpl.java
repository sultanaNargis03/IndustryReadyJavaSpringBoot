package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.VaccineInfo2;
import com.telusko.dao.IVaccineRepo;

@Service
public class VaccineImpl implements IVaccine
{
	@Autowired
	IVaccineRepo repo;

	@Override
	public String registerVaccine(VaccineInfo2 vaccine) 
	{
		repo.save(vaccine);
		return "vaccine registered with id "+vaccine.getId() ;
	}

	@Override
	public Iterable<VaccineInfo2> registerAllVaccine(List<VaccineInfo2> vaccine) {
		
		return repo.saveAll(vaccine);
	}

	@Override
	public Long countTotalVaccine() {
		
		return repo.count();
	}

	@Override
	public Optional<VaccineInfo2> findById(Long id) 
	{
		
		return repo.findById(id);
	}

	@Override
	public Iterable<VaccineInfo2> findByIds(List<Long> id) {
		
		return repo.findAllById(id);
	}

	@Override
	public String deleteById(Long id) 
	{
		Optional<VaccineInfo2> vaccine = repo.findById(id);
		if(vaccine.isPresent())
		{
			repo.deleteById(id);
			return "vaccine with id "+id+" got deleted !!";
		}	
		return "vaccine with id "+id+" not present to delete !!";
	}

	@Override
	public String deleteByIds(List<Long> ids) {
		
		Iterable<VaccineInfo2> list = repo.findAllById(ids);
		int count=ids.size();
		if(count==((List) list).size())
		{
			repo.deleteAllById(ids);
			return count +" Num of rows deleted!!";
		}
		return "something wrong with ids";
	}

	@Override
	public String deleteByObject(VaccineInfo2 vaccine) {
		Optional<VaccineInfo2> v = repo.findById(vaccine.getId());
		if(v.isPresent())
		{
			repo.delete(vaccine);
			return "vaccine with id "+vaccine.getId()+" deleted!!";
		}	
		return "vaccine with id "+vaccine.getId()+" not present!!";
	}

	

}
