package com.telusko.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="VaccineInfo2")
public class VaccineInfo2 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String vaccineName;
	private String vaccineCompany;
	private Long price;
	
	public VaccineInfo2() 
	{
		System.out.println("VaccineInfo object created...");
	}
		
	public VaccineInfo2(String vaccineName, String vaccineCompany, Long price) {
		super();
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.price = price;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVaccineName() {
		return vaccineName;
	}


	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}


	public String getVaccineCompany() {
		return vaccineCompany;
	}


	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}


	public Long getPrice() {
		return price;
	}


	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VaccineInfo2 [vaccineName=" + vaccineName + ", vaccineCompany=" + vaccineCompany + ", price=" + price
				+ "]";
	}
	
}
