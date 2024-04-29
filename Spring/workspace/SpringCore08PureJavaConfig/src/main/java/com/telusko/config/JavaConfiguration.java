package com.telusko.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.telusko"})
public class JavaConfiguration 
{

	public JavaConfiguration() 
	{
		System.out.println("Java config instantiated");
	}
	@Bean
	public LocalDateTime createBean()
	{
		System.out.println("LocalDateTime obj by dev");
		return LocalDateTime.now();
	}
}
