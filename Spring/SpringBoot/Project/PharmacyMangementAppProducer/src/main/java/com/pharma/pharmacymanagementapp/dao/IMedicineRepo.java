package com.pharma.pharmacymanagementapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.pharmacymanagementapp.model.Medicine;

public interface IMedicineRepo extends JpaRepository<Medicine, Integer> 
{

}
