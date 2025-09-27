package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
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
		// Saving object parent to child
		Integer pid = perRepo.save(person).getPid();
		return "Person is saved with id: " + pid;
	}

	@Override
	public String regPhoneNumberWithPerson(List<PhoneNumber> list) {

		List<PhoneNumber> result = phnorepo.saveAll(list);

		return result.size() + "number of Child are linked with parent saved!!";
	}
	
	@Override
	public List<Person> loadPersonAndHisPhoneNumbers() {
		return perRepo.findAll();
	} 
	
	@Override
	public List<PhoneNumber> loadPhoneNumberWithPerson() {
		return phnorepo.findAll();
	}
	
	

}
