package com.learning.aws.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.aws.exception.EmployeeNotFoundException;
import com.learning.aws.model.Employee;
import com.learning.aws.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepo repo;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		
		return repo.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee with id "+id+" not exist!!"));
	}

	@Override
	public String addEmployee(Employee employee) {
		
		Employee emp=repo.save(employee);
		return "Employee added succcessfully with id: "+emp.getId();
	}

	@Override
	public String updateEmployee(Employee employee) {
		
		Integer eid = employee.getId();
		if(repo.findById(eid).isPresent())
		{
			repo.save(employee);
			return "Employee details updated succcessfully!";
		}
		else {
			throw new EmployeeNotFoundException("Employee with id "+eid+ " not exist!!");
		}
	}

	@Override
	public String deleteEmployee(Integer id) {
		
		Optional<Employee> emp = repo.findById(id);
		if(emp.isPresent())
		{
//			repo.deleteById(id);
			repo.delete(emp.get());
			return "Employee with id "+id+ " deleted successfuly!!";
		}
		else
		{
			return "Employee with id "+id+ " not exist!!";
		}
	}

	
	

}
