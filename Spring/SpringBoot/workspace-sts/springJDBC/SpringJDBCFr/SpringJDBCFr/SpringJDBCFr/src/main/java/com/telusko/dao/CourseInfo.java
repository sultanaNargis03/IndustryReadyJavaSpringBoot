package com.telusko.dao;

public class CourseInfo 
{
     private Integer cid;
     
     private String cname;
     
     public CourseInfo()
     {
    	 System.out.println("Course Info zero param Constructor");
     }
     
     public CourseInfo(Integer cid, String cname)
     {
    	 this.cid=cid;
    	 this.cname=cname;
     }
     

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	@Override
	public String toString() {
		return "CourseInfo [cid=" + cid + ", cname=" + cname + "]";
	}
	
     
     
}
