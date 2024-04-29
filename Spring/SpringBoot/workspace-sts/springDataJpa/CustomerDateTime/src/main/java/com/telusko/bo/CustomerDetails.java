package com.telusko.bo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerDetails
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cid;
	private String cname;
	private String city;
	private LocalDateTime dob;
	private LocalTime regTime;
	private LocalDate regDate;
	
	public CustomerDetails() 
	{
		System.out.println("bo object created");
	}

	public CustomerDetails(String cname, String city, LocalDateTime dob, LocalTime regTime,
			LocalDate regDate) {
		super();
		
		this.cname = cname;
		this.city = city;
		this.dob = dob;
		this.regTime = regTime;
		this.regDate = regDate;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public LocalTime getRegTime() {
		return regTime;
	}

	public void setRegTime(LocalTime regTime) {
		this.regTime = regTime;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "CustomerDetails [cid=" + cid + ", cname=" + cname + ", city=" + city + ", dob=" + dob + ", regTime="
				+ regTime + ", regDate=" + regDate + "]";
	}
	
	

}
