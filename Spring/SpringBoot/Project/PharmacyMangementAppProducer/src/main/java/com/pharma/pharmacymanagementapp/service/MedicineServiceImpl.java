package com.pharma.pharmacymanagementapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.pharmacymanagementapp.dao.IMedicineRepo;
import com.pharma.pharmacymanagementapp.model.Medicine;

@Service
public class MedicineServiceImpl implements IMedicineService {

	@Autowired
	IMedicineRepo repo;
	
	@Override
	public String addMedicine(Medicine medicine) 
	{
		List<Medicine> med = repo.findAll();
		for(Medicine m:med)
		{
			if(medicine.getMedicineCompany().equalsIgnoreCase(m.getMedicineCompany())&&medicine.getMedicineComposition().equalsIgnoreCase(m.getMedicineComposition()))
			{
				return "Medicine "+medicine.getMedicineCompany() +" with composition "+medicine.getMedicineComposition() + " already exist!! you can't add it again!!you can update the quantity";
			}
		}
		repo.save(medicine);
		return medicine.getMedicineCompany()+" added successfully!!";
	}

	@Override
	public List<Medicine> showAllMedicines() 
	{
		
		return repo.findAll();
	}

	@Override
	public Medicine showMedicineById(Integer id) 
	{
		
		return repo.findById(id).get();
		
	}

	@Override
	public String deleteMedicineById(Integer id) 
	{
		Optional<Medicine> medicineId = repo.findById(id);
		if(medicineId.isPresent())
		{
			repo.deleteById(id);
			return "Medicine with id "+id +" deleted successfully!!";
		}
		
		return "Medicine with id "+id +" not exist!!";
	}

	@Override
	public String updateMedicine(Medicine medicine) 
	{

		Integer id=medicine.getId();
		Optional<Medicine> optional = repo.findById(id);
		if(optional.isPresent())
		{
			repo.save(medicine);
			return "Medicine with id "+id +" updated successfully!!";
		}
		return "Medicine with id "+id +" not exist!!";
	}

	
}
