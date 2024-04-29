package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public List<VaccineDetails> searchVaccineByGivenData(VaccineDetails vaccine, boolean status, String... args) 
	{
		Example<VaccineDetails> example = Example.of(vaccine);
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, args);
		
		return repo.findAll(example,sort);
	}

	@Override
	public List<VaccineDetails> searchVaccineByGivenObject(VaccineDetails vaccine) {
		
		Example<VaccineDetails> example = Example.of(vaccine);
		return repo.findAll(example);
	}

	@Override
	public VaccineDetails searchVaccineById(Long id) {
		
		//return repo.getById(id);
		return repo.getReferenceById(id);
	}

	@Override
	public String removeVaccineByIds(Iterable<Long> ids) {
		List<VaccineDetails> list = repo.findAllById(ids);
		
		if(list.size()!=0)
		{
			repo.deleteAllByIdInBatch(ids);
			return "records deleted";
		}
		
		return "something wrong";
	}


	
	

}
