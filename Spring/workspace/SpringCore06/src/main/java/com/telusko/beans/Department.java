package com.telusko.beans;

public class Department {

	private Integer depNo;
	private String depName;
//	public Department() 
//	{
//		System.out.println("Dept obj created");
//	}
	
	public Department(Integer depNo, String depName) {
		super();
		this.depNo = depNo;
		this.depName = depName;
		System.out.println("Dept obj created");
	}

	public void setDepNo(Integer depNo) {
		this.depNo = depNo;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "Department [depNo=" + depNo + ", depName=" + depName + "]";
	}
	

}
