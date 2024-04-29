package com.telusko.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value="voter")
@PropertySource(value="com/telusko/commons/application.properties")
public class Voter 
{
	@Value("${voter.info.name}")
	private String name;
	@Value("${voter.info.age}")
	private int age;
	
	static
	{
		System.out.println("voter classes loading...");
	}
	
	public Voter() 
	{
		System.out.println("voter is instantiated");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("");
	}
	
	//business logic
	public String checkEligibility()
	{
		
		System.out.println("Method calll with business logic");
		if(age>=18)
			return "Hello! "+name+" you are eligible for voting";
		else
			return "Hello! "+name+" you are not eligible for voting";
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("been destroyed");
	}
}
