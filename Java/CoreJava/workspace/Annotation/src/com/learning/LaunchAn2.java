package com.learning;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.FIELD)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String country() default "India";
	int age() default 36;
//	String country();
//	int age();
}


//He is cricket player

@CricketPlayer
class RohitSharma
{
	//@CricketPlayer(country ="India" ,age=35)
	int runs;
	int matches;
	
	
	public RohitSharma()
	{
		System.out.println("Rohit did his best!");
	}
	public void setRuns(int runs)
	{
		this.runs=runs;
	}
	
	public int getRuns()
	{
		return runs;
	}
	

	public void setMatches(int matches)
	{
		this.matches=matches;
	}
	
}

public class LaunchAn2 
{

	public static void main(String[] args) 
	{
		RohitSharma rs=new RohitSharma();
		
		rs.setRuns(20000);
		
		System.out.println(rs.getRuns() + " : Runs");
		
		Class cls=rs.getClass();
		
		Annotation an=cls.getAnnotation(CricketPlayer.class);
		CricketPlayer cp=(CricketPlayer)an;
		int age=cp.age();
		System.out.println("Age data in annotation : " + age);
		
		System.out.println(cp.country());

	}

}
