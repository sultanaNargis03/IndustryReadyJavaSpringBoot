package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineInfo2;
import com.telusko.service.VaccineImpl;

@SpringBootApplication
public class VaccineMangementApp1Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(VaccineMangementApp1Application.class, args);
		VaccineImpl service = context.getBean(VaccineImpl.class);
		
//		String msg=service.registerVaccine(new VaccineInfo2("covishield","BharatBio",5000l));
//		System.out.println(msg);
		
//		List<VaccineInfo2> vaccineList=new ArrayList<>();
//		vaccineList.add(new VaccineInfo2("CovidShield", "Astrazenica", 45454l));
//		vaccineList.add(new VaccineInfo2("Phizer", "Moderna", 4544l));
//		vaccineList.add(new VaccineInfo2("Sputnik", "RussianBased", 4454l));
		
//		Iterable<VaccineInfo2> vaccine=service.registerAllVaccine(vaccineList);	
//		for(VaccineInfo2 v:vaccine)
//			System.out.println(v);
		
//		service.registerAllVaccine(vaccineList).forEach(v->System.out.println(v));
		
		System.out.println("Total vaccine : "+service.countTotalVaccine());
	
		Long id=5l;
//		Optional<VaccineInfo2> optional = service.findById(id);
//		
//		if(optional.isPresent())
//			System.out.println(optional.get());
//		optional.orElse(new VaccineInfo2());
		System.out.println(service.findById(id).orElse(new VaccineInfo2()));
		
//		List<Long>id=new ArrayList<>();
//		id.add(1l);
//		id.add(2l);
//		id.add(3l);
//		Iterable<VaccineInfo2> vaccineList = service.findByIds(id);
//		for(VaccineInfo2 v:vaccineList)
//			System.out.println(v);
//		service.findByIds(id).forEach(v->System.out.println(v));
//		System.out.println(service.deleteById(5l));
		
//		VaccineInfo2 obj=new VaccineInfo2();
//		obj.setId(6l);
//		obj.setVaccineName("default");
//		obj.setVaccineCompany("default");
//		obj.setPrice(0l);
//		service.registerVaccine(obj);
//		System.out.println(service.deleteByObject(obj));
		
	}

}
