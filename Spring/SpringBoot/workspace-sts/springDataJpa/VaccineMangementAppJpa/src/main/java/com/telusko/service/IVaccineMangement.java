package com.telusko.service;

import java.util.List;
import java.util.Optional;

import com.telusko.bo.VaccineDetails;

public interface IVaccineMangement 
{
		public List<VaccineDetails> searchVaccineByGivenData(VaccineDetails vaccine,boolean status,String...args);
		public List<VaccineDetails> searchVaccineByGivenObject(VaccineDetails vaccine);
		public VaccineDetails searchVaccineById(Long id);
		public String removeVaccineByIds(Iterable<Long>ids);
}
