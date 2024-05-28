package com.telusko.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cid;
    private String cname;    private Integer noOfModules;
	private Double fees;
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="courses")
	@JsonBackReference
	private Set<Student> students;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String cname, Integer noOfModules, Double fees) {
		super();
		this.cname = cname;
		this.noOfModules = noOfModules;
		this.fees = fees;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getNoOfModules() {
		return noOfModules;
	}

	public void setNoOfModules(Integer noOfModules) {
		this.noOfModules = noOfModules;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", noOfModules=" + noOfModules + ", fees=" + fees
				+ ", students=" + students + "]";
	}
	
	
	

}
