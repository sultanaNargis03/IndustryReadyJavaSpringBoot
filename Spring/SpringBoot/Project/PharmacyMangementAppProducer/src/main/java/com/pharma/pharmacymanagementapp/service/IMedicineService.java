package com.pharma.pharmacymanagementapp.service;

import java.util.List;

import com.pharma.pharmacymanagementapp.model.Medicine;

public interface IMedicineService 
{
	
	public String addMedicine(Medicine medicine);
	public List<Medicine> showAllMedicines();
	public Medicine showMedicineById(Integer id);
	public String deleteMedicineById(Integer id);
	public String updateMedicine(Medicine medicine);

	
	
}
