package com.pharma.pharmacymanagementapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(title="Pharmacy API",
		version="1.0",
		description="This API is to book ticket"),
		servers=@Server(
				url="http://localhost:8088/Pharmacy",
				description="This API URL will help to order medicine"
				
				)
		)
public class PharmacyMangementAppApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(PharmacyMangementAppApplication.class, args);
		
		
	}

}
