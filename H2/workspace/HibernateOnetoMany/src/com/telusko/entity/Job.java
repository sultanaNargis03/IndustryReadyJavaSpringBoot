package com.telusko.entity;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Job 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String role;
	private String tech[];
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Employees> employees;

	public Job()
	{
		System.out.println("Job --cons");
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String[] getTech() {
		return tech;
	}

	public void setTech(String[] tech) {
		this.tech = tech;
	}

	public Set<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employees> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", title=" + title + ", role=" + role + ", tech=" + Arrays.toString(tech)
				+ ", employees=" + employees + "]";
	}
	
	
	
	
}
