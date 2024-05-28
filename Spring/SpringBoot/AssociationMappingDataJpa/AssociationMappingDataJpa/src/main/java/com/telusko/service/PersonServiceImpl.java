package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Person;
import com.telusko.model.PhoneNumber;
import com.telusko.repository.IPersonRepo;
import com.telusko.repository.IPhoneNumberRepo;

@Service
public class PersonServiceImpl implements IPersonalInfoManagementService {

	@Autowired
	private IPersonRepo prepo;
	@Autowired
	private IPhoneNumberRepo phrepo;

	@Override
	public String savePerson(Person person) {
		
//		Integer id=prepo.save(person).get
		Integer id=prepo.save(person).getPid();
		return "Person and phone number has been added int DB with id "+ id;
	}

	@Override
	public String savePhoneNumbers(Iterable<PhoneNumber> numbers) {
		for(PhoneNumber number:numbers) 
		{
			phrepo.save(number);
		}
		
		return "Phone numbers added";
	}

}
