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
public class VaccineMangementAppApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(VaccineMangementAppApplication.class, args);
		VaccineMangementImpl service = context.getBean(VaccineMangementImpl.class);
		
		VaccineDetails vaccine=new VaccineDetails("Covaxin","BharatBio",45454);
		
//		service.searchVaccineByGivenData(vaccine, true, "vaccineName","vaccineCompany")
//		.forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));		
//		service.searchVaccineByGivenObject(vaccine)
//		.forEach(v->System.out.println(v));		
//		System.out.println(service.searchVaccineById(6l));
		List<Long>ids=new ArrayList<>();
		ids.add(1l);
		ids.add(4l);
		ids.add(7l);
		
		System.out.println(service.removeVaccineByIds(ids));
		
		context.close();
		
	}

}
