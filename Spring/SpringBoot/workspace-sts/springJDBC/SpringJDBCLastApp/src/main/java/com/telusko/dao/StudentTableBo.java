package com.telusko.dao;

public class StudentTableBo 
{
	private Integer sid;
	private String sname;
	private Integer sage;
	private String scity;
	

	public StudentTableBo() 
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