package com.telusko.service;

import java.util.List;
import java.util.Optional;

import com.telusko.bo.VaccineInfo2;

public interface IVaccine 
{
	public String registerVaccine(VaccineInfo2 vaccine);
	public Iterable<VaccineInfo2> registerAllVaccine(List<VaccineInfo2> vaccine);
	public Long countTotalVaccine();
	public Optional<VaccineInfo2> findById(Long id);
	public Iterable<VaccineInfo2> findByIds(List<Long> id);
	public String deleteById(Long id);
	public String deleteByIds(List<Long> id);
	public String deleteByObject(VaccineInfo2 vaccine);
}
