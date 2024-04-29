package com.telusko.controller;

public class Tourist {
	
private Integer tid;  
	
	private String city;
	
	private String name;
	
	private String packageType;
	
	private Double budget;
	

	public Tourist(Integer tid, String city, String name, String packageType, Double budget) {
		super();
		this.tid = tid;
		this.city = city;
		this.name = name;
		this.packageType = packageType;
		this.budget = budget;
	}

	public Tourist() {
		super();
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

}
