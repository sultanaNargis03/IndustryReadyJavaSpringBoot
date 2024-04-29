package com.pharma.pharmacymanagementapp.exception;

public class MedicineNotFoundException extends RuntimeException{

	public MedicineNotFoundException(String message) 
	{
		super(message);
	}

}
