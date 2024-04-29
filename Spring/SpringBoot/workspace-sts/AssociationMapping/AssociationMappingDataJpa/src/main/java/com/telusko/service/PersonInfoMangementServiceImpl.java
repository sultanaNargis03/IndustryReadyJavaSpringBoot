package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Person;
import com.telusko.model.PhoneNumber;
import com.telusko.repo.IPersonRepo;
import com.telusko.repo.IPhoneNumberRepo;

@Service
public class PersonInfoMangementServiceImpl implements IPersonalInfoManagementService {

	@Autowired
	private IPersonRepo prepo;
	@Autowired
	private IPhoneNumberRepo phrepo;
	@Override
	public String savePerson(Person person)
	{
		// TODO Auto-generated method stub
		Integer id = prepo.save(person).getPid();
		return "Person and PhoneNumbers have been added int db "+id;
	}

	@Override
	public String savePhoneNumbers(Iterable<PhoneNumber> numbers) {
		// TODO Auto-generated method stub
		for(PhoneNumber num:numbers)
		{
			phrepo.save(num);
		}
		return "The Phone numbers are added in DB!!";
	}

}
