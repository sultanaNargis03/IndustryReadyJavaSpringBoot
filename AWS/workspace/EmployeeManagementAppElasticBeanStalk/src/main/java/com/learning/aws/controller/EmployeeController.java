package com.learning.aws.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.learning.aws.model.Employee;
import com.learning.aws.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl service;

	@GetMapping("/Employees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		
		return new ResponseEntity<>(service.getAllEmployees(),HttpStatus.OK);
	}
	
	@GetMapping("/Employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id)
	{
		
		return new ResponseEntity<>(service.getEmployeeById(id),HttpStatus.OK);
	}
	
	@PostMapping("/Employee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee)
	{
		
		return new ResponseEntity<>(service.addEmployee(employee),HttpStatus.CREATED);
	}
	@PutMapping("/Employee")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee)
	{
		
		return new ResponseEntity<>(service.updateEmployee(employee),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/Employee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id)
	{
		
		return new ResponseEntity<>(service.deleteEmployee(id),HttpStatus.OK);
	}
	

}