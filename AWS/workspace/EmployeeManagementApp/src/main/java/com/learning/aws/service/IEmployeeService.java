package com.learning.aws.service;

import java.util.List;

import com.learning.aws.model.Employee;


public interface IEmployeeService 
{
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(Integer id);
	public String addEmployee(Employee employee);
	public String updateEmployee(Employee employee);
	public String deleteEmployee(Integer id);
}
