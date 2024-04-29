package com.telusko.bo;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class JobSeeker 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String city;
	
	@Lob
	@Column(length=10000)
	private byte[] image;
	@Lob
	private char[] textFile;

	public JobSeeker() 
	{
		System.out.println("JobSeeker objecect created!");
	}

	public JobSeeker(String name, String city, byte[] image, char[] textFile) {
		
		this.name = name;
		this.city = city;
		this.image = image;
		this.textFile = textFile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public char[] getTextFile() {
		return textFile;
	}

	public void setTextFile(char[] textFile) {
		this.textFile = textFile;
	}

	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", name=" + name + ", city=" + city + ", image=" + Arrays.toString(image)
				+ ", textFile=" + Arrays.toString(textFile) + "]";
	}
	

}
