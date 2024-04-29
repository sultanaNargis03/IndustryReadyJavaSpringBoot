package com.telusko.beans;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
	
	@Bean
	public LocalTime createTimeBean()
	{
		return LocalTime.now();
	}

}
