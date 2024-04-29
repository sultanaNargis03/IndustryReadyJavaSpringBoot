package com.telusko.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.model.Person;
import com.telusko.model.PhoneNumber;
import com.telusko.service.PersonInfoMangementServiceImpl;
@Component
public class AssociationMappingRunner implements CommandLineRunner {

	@Autowired
	private PersonInfoMangementServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception 
	{
		
		/*
			Person person=new Person("Nargis","Kolkata");
			
			PhoneNumber p1=new PhoneNumber(798011057L,"JIO");
			PhoneNumber p2=new PhoneNumber(798040057L,"AIRTEL");
			
			p1.setPerson(person);
			p2.setPerson(person);
			
			Set<PhoneNumber> contactDetails = Set.of(p1,p2);
			
			person.setContactDetails(contactDetails);
			
			String status = service.savePerson(person);
			System.out.println(status);
		*/	
Person person=new Person("Tamim","Kolkata");
		
		PhoneNumber p1=new PhoneNumber(629011455L,"JIO");
		PhoneNumber p2=new PhoneNumber(804005327L,"AIRTEL");
		
		p1.setPerson(person);
		p2.setPerson(person);
		
		Set<PhoneNumber> contactDetails = Set.of(p1,p2);
		
		person.setContactDetails(contactDetails);
		
		String status = service.savePhoneNumbers(contactDetails);
		System.out.println(status);

	}

}
