package com.telusko;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.*;

@SpringBootApplication
public class VaccineMangementAppApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(VaccineMangementAppApplication.class, args);
		VaccineMangementImpl service = context.getBean(VaccineMangementImpl.class);		

		service.fetchVaccineByCompanyName("BharatBio").forEach(v->System.out.println(v));
		System.out.println("****************************************************************");
		
		service.fetchVaccineByCompanies("Bharatbio", "Astrazenica").forEach(v->System.out.println(v));
		System.out.println("****************************************************************");
		
		service.fetchVaccineByPriceRange(454,54345).forEach(v->System.out.println(v));
		System.out.println("****************************************************************");
		
//		service.fetchVaccineDetailsByVaccineName("Covaxin", "Sputnik").forEach(v->System.out.println(v));
		
		List<Object[]> vaccineDetails = service.fetchVaccineDetailsByVaccineName("Covaxin", "Sputnik");
		for(Object[] obj:vaccineDetails)
		{
			for(Object vaccine:obj)
			{
				System.out.println(vaccine);
			}
		}
		
		System.out.println("****************************************************************");
		service.changePriceByVaccine(1500, "Sputnik");
		
		System.out.println("****************************************************************");
		
		int n=service.deleteVaccineByPriceRange(6352, 34524);
		System.out.println("Number of record deleted : "+n);
		
		
		service.insertVaccines("Phizer", "Moderna",34555);
		
		Date date=service.getSystemDateAndTime();
		System.out.println(date);
		
		context.close();
	}

}
