package com.learning;

//class Result extends Enum
//{

//	}


enum Result
{
	PASS, FAIL, NR;
	
	//public static final Result PASS=new Result();
	//public static final Result FAIL=new Result();
	//public static final Result NR=new Result();
	
	double grades;
	
	Result()
	{
		System.out.println("Constructor invocked");
	}
	
	public void setGrades(double grades)
	{
		this.grades=grades;
	}
	
	public double getGrades()
	{
		return grades;
	}	
}
public class LaunchEnum2 {

	public static void main(String[] args) 
	{
		Result.PASS.setGrades(23.4);
		
		double gr=Result.PASS.getGrades();
		System.out.println(gr + " Grades for PASS");
		
		double gr2=Result.FAIL.getGrades();
		System.out.println(gr2 + " Grades for FAIL");

	}

}
