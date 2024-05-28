package com.telusko.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.model.Person;
import com.telusko.model.PhoneNumber;
import com.telusko.service.PersonServiceImpl;

@Component
public class AssociationMappingRunner implements CommandLineRunner 
{
	@Autowired
	private PersonServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception 
	{
		/*
		 * 
		 */
//		Person person =new Person("Nargis","Kol");
//		
//		PhoneNumber p1= new PhoneNumber(6564871L,"JIO");
//		PhoneNumber p2= new PhoneNumber(9235771L,"AIRTEL");
//		p1.setPerson(person);
//		p2.setPerson(person);
//		
//		Set<PhoneNumber> numbers=Set.of(p1,p2);
//		person.setContactDetails(numbers);
//		
//		String status=service.savePerson(person);
//		System.out.println(status);
//		
		Person person=new Person("Dona","HYd");
		
		PhoneNumber p1= new PhoneNumber(4564871L,"JIO");
		PhoneNumber p2= new PhoneNumber(2235771L,"AIRTEL");
		
		p1.setPerson(person);
		p2.setPerson(person);
		
		Set<PhoneNumber> numbers=Set.of(p1,p2);
		person.setContactDetails(numbers);
		
		service.savePhoneNumbers(numbers);
	}
	
}
