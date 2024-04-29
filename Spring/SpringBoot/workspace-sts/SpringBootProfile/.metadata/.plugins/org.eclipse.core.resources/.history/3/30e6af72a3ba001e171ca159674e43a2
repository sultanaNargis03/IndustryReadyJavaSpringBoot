package com.telusko.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
@Profile("spring")
public class SpringBoot implements Courses 
{

	@Override
	public boolean registerToCourse(Double cost) {
		System.out.println("SpringBoot course registered amount paid "+cost);
		return true;
	}

}
