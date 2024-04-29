package com.telusko.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetMe 
{
	@Autowired
	private LocalDateTime date;
	public GreetMe() 
	{
		System.out.println("GreetMe been crated");
	}
	public String generateGreeting(String name)
	{
		int hour=date.getHour();
		
		if(hour<12)
			return "Good Mornning! " +name;
		else if(hour<16)
			return "Good Afternoon! " +name;
		else if(hour<20)
			return "Good Evening! " +name;
		else
			return "Good Night! " +name;
	}
}
