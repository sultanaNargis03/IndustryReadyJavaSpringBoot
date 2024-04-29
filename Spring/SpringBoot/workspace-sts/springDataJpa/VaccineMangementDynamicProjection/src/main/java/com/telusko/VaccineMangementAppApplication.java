package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.*;
import com.telusko.view.ResultView1;
import com.telusko.view.ResultView2;
import com.telusko.view.ResultView3;

@SpringBootApplication
public class VaccineMangementAppApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(VaccineMangementAppApplication.class, args);
		VaccineMangementImpl service = context.getBean(VaccineMangementImpl.class);		
		
		List<ResultView2> list1 = service.fetchByVaccineCompany("BharatBio",ResultView2.class );
		
		list1.forEach(v->System.out.println(v.getId()+" : "+v.getVaccineName()+": "+v.getVaccineCompany()));

		List<ResultView1> list2 = service.fetchByVaccineCompany("BharatBio",ResultView1.class );
		list2.forEach(v->System.out.println(v.getId()+" : "+": "+v.getVaccineCompany()));

		List<ResultView3> list3 = service.fetchByVaccineCompany("BharatBio",ResultView3.class );
		list3.forEach(v->System.out.println(v.getPrice()));

		context.close();
	}

}
