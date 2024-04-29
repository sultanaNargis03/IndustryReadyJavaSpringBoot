package com.pharma.pharmacymanagementapp.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pharma.pharmacymanagementapp.exception.MedicineNotFoundException;

@RestControllerAdvice
public class MedicineErrorController 
{
	@ExceptionHandler(MedicineNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleExceptionMedicine(MedicineNotFoundException ex)
	{
		ErrorDetails error=new ErrorDetails("404 not found",ex.getMessage(),LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleExceptionMedicine(Exception ex)
	{
		ErrorDetails error=new ErrorDetails("404 not found",ex.getMessage(),LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
