package com.telusko.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.Voter;

public class Launch07 {

	public static void main(String[] args) 
	{
		System.out.println("Container started");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Voter voter=(Voter) context.getBean("voter");
		System.out.println(voter.checkEligibility());
		
		context.close();
		System.out.println("Container stopped");
	
	}

}
