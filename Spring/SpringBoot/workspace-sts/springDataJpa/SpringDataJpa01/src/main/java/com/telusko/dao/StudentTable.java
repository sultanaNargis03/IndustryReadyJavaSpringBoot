package com.telusko.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class StudentTable {
	@Id
	private Integer sid;
	private Integer sage;
	private String sname;
	private String scity;
	

	public StudentTable() 
	{
		System.out.println("StudentTableBo object created");
	}
	
	public Integer getSid() {
		return sid;
	}


	public void setSid(Integer sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Integer getSage() {
		return sage;
	}


	public void setSage(Integer sage) {
		this.sage = sage;
	}


	public String getScity() {
		return scity;
	}


	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "StudentTableBo [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", scity=" + scity + "]";
	}

}
