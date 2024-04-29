package com.pharma.pharmacymanagementapp.model;

public class User 
{
	
	private Integer id;
	private Integer name;
	private String mailId;
	private String phnNo;
	
	public User() 
	{
		
	}

	public User(Integer id, Integer name, String mailId, String phnNo) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.phnNo = phnNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mailId=" + mailId + ", phnNo=" + phnNo + "]";
	}

}
