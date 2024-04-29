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
//		Iterable<VaccineDetails> vList = service.fetchDetails(false,"vaccineName","vaccineCompany");
//		vList.forEach(v->System.out.println(v));
		
		//service.fetchDetailsByPgNo(0, 3, true, "vaccineName","vaccineCompany").forEach((c)->System.out.println(c.getVaccineName()+" "+c.getVaccineCompany()));
		service.fetchDetailsByPagination(2);
		context.close();
		
		
	}

}
