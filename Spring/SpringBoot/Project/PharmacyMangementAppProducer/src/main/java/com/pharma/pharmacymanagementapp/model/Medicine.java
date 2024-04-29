package com.pharma.pharmacymanagementapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String medicineCompany;
	private String medicineComposition;
	private Double medicinePrice;
	private Integer medicineQuantity;
	private LocalDate expiryDate;
	
	public Medicine() 
	{
		
	}

	public Medicine(Integer id,String medicineCompany, String medicineComposition, Double medicinePrice, Integer medicineQuantity,
			 LocalDate expiryDate) 
	{
		this.id=id;
		this.medicineCompany = medicineCompany;
		this.medicineComposition = medicineComposition;
		this.medicinePrice = medicinePrice;
		this.medicineQuantity = medicineQuantity;
		
		this.expiryDate = expiryDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMedicineCompany() {
		return medicineCompany;
	}

	public void setMedicineCompany(String medicineCompany) {
		this.medicineCompany = medicineCompany;
	}

	public String getMedicineComposition() {
		return medicineComposition;
	}

	public void setMedicineComposition(String medicineComposition) {
		this.medicineComposition = medicineComposition;
	}

	public Double getMedicinePrice() {
		return medicinePrice;
	}

	public void setMedicinePrice(Double medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

	public Integer getMedicineQuantity() {
		return medicineQuantity;
	}

	public void setMedicineQuantity(Integer medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medicineCompany=" + medicineCompany + ", medicineComposition="
				+ medicineComposition + ", medicinePrice=" + medicinePrice + ", medicineQuantity=" + medicineQuantity
				+ ", expiryDate=" + expiryDate + "]";
	}
	

}
