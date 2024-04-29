package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.telusko.service.IGreetService;



@RestController 
public class GreetingController 
{
	@Autowired
	private IGreetService service;
	
	@GetMapping("/api1")
	public ResponseEntity generateGreetings()
	{
		String body=service.generateWishes();
		
		return new ResponseEntity<String>(body, HttpStatus.OK);//200
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist)
	{
	
		boolean status=service.registerTourist(tourist);
		String statusMessage="";
		if(status)
		{
			statusMessage="Tourist Saved";
			return new ResponseEntity<String>(statusMessage, HttpStatus.CREATED);
		}
		else
		{
			statusMessage="Tourist Not Saved";
			return new ResponseEntity<String>(statusMessage, HttpStatus.BAD_REQUEST);
		}
		
			
	}
}
