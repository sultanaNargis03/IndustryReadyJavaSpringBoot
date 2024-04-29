package com.telusko.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="VaccineInfo")
public class VaccineDetails 
{
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="VACCINENAME")
	private String vaccineName;
	@Column(name="VACCINECOMPANY")
	private String vaccineCompany;
	@Column(name="PRICE")
	private Integer price;

	public VaccineDetails() 
	{
		System.out.println("Vaccine details object created");
	}
	
	public VaccineDetails(String vaccineName, String vaccineCompany, Integer price) {
		
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VaccineDetails [id=" + id + ", vaccineName=" + vaccineName + ", vaccineCompany=" + vaccineCompany
				+ ", price=" + price + "]";
	}

	

}
