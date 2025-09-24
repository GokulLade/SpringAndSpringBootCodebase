package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumberRepo;

@Service
public class OtoMService implements IOtoMService {

	@Autowired
	private IPersonRepo perRepo;
	@Autowired
	private IPhoneNumberRepo phnorepo;
	
	@Override
	public String regPersonAndhisPhoneNumber(Person person) {
		//Saving objec parent to child
		Integer pid=perRepo.save(person).getPid();
		return "Person is saved with id: "+pid;
	}

}
