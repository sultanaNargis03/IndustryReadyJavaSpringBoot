package com.telusko.bean;

public class Employee {

	private Integer id;
	private String empName;
	private String empCity;
	private Float empSalary;
	static
	{
		System.out.println("Employee class loaded");
	}
	public Employee() 
	{
		System.out.println("Employee been created");
	}
	
	public Employee(Integer id, String empName, String empCity, Float empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
		System.out.println("Param cons invocked");
	}
	public String empActivity()
	{
		System.out.println("Employee usually sleep at office after lunch");
		
		return "If manager is around employee will try to act active";
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}
	

}
