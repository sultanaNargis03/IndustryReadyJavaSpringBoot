package com.telusko.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.telusko.controller.Tourist;

@Service
public class GenerateWishesService implements IGreetService
{
	
	public String generateWishes()
	{
		LocalDateTime datetime = LocalDateTime.now();
		int hour=datetime.getHour();
		String body=null;
		
		if(hour<12)
			body="Good Morning";
		else if(hour<16)
			body="Good AfterNoon";
		else if(hour<20)
			body="Good Evening";
		else
			body="Good Night";
		
		return body;
	}
	
	@Override
	public Boolean registerTourist(Tourist tourist) {
		
		System.out.println("Data stored in DB");
		///Dao --> Persistence logic to store tourist object
		return true;
	}

	
	
	

}
