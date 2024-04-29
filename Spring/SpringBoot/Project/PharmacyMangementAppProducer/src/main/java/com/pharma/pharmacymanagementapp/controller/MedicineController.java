package com.pharma.pharmacymanagementapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharma.pharmacymanagementapp.model.Medicine;
import com.pharma.pharmacymanagementapp.service.MedicineServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/medicine")
@Tag(name="Pharmacy",description="This API URL will help to order medicine")
public class MedicineController 
{
	@Autowired
	MedicineServiceImpl service;
	
	@Operation(summary="POST operation",description="API will accept json medicine(don't need to give id,id is auto incremented) obj and add new medicine")
	@PostMapping("/addMedicine")
	public ResponseEntity<String> addMedicine(@RequestBody Medicine medicine)
	{
		String msg=service.addMedicine(medicine);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@Operation(summary="GET operation",description="API will get all available medicine info")
	@GetMapping("/showAllMedicines")
	public ResponseEntity<List<Medicine>> showMedicine()
	{
		List<Medicine> medicine=service.showAllMedicines();
		return new ResponseEntity<>(medicine,HttpStatus.OK);
	}
	
	@Operation(summary="GET operation",description="API will accept medicine id and get medicine info")
	@GetMapping("/showMedicine/{id}")
	public ResponseEntity<Medicine> showMedicineById(@PathVariable("id") Integer id)
	{
		Medicine medicine = service.showMedicineById(id);
		return new ResponseEntity<>(medicine,HttpStatus.OK);
	}
	
	@Operation(summary="POST operation",description="API will accept json medicine obj and update medicine info")
	@PutMapping("/updateMedicine")
	public ResponseEntity<String> updateMedicine(@RequestBody Medicine medicine )
	{
		String msg = service.updateMedicine(medicine);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

	@Operation(summary="GET operation",description="API will accept medicine id and get delete medicine")
	@DeleteMapping("/deleteMedicine/{id}")
	public ResponseEntity<String> deleteMedicineById(@PathVariable("id") Integer id)
	{
		String msg = service.deleteMedicineById(id);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	
}
