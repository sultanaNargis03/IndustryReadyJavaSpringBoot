package com.telusko.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	private String name;
	private String  city;
	
	@OneToMany(targetEntity=PhoneNumber.class,cascade=CascadeType.ALL)
	private Set<PhoneNumber> contactDetails;
	
	public Person() 
	{
		
	}

	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Person(String name, String city, Set<PhoneNumber> contactDetails) {
		super();
		this.name = name;
		this.city = city;
		this.contactDetails = contactDetails;
	}

	public Person(Integer pid, String name, String city, Set<PhoneNumber> contactDetails) {
		super();
		this.pid = pid;
		this.name = name;
		this.city = city;
		this.contactDetails = contactDetails;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<PhoneNumber> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Set<PhoneNumber> contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + ", contactDetails=" + contactDetails + "]";
	}

}
