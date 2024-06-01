package com.telusko.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PhoneNumber 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer regNo;
	private Long phNo;
	private String provider;
	
	@ManyToOne(targetEntity=Person.class,cascade=CascadeType.ALL)
	private Person person;
	public PhoneNumber() 
	{
		
	}
	public PhoneNumber(Integer regNo, Long phNo, String provider, Person person) {
		super();
		this.regNo = regNo;
		this.phNo = phNo;
		this.provider = provider;
		this.person = person;
	}
	
	public PhoneNumber(Long phNo, String provider) {
		super();
		this.phNo = phNo;
		this.provider = provider;
	}
	public Integer getRegNo() {
		return regNo;
	}
	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phNo=" + phNo + ", provider=" + provider + ", person=" + person + "]";
	}
	

}