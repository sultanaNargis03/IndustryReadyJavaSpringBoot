package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.*;

@SpringBootApplication
public class VaccineMangementAppApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(VaccineMangementAppApplication.class, args);
		VaccineMangementImpl service = context.getBean(VaccineMangementImpl.class);

		context.close();
		
		
	}

}
