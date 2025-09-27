package com.nt.service;

import java.util.List;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IOtoMService {

	public String regPersonAndhisPhoneNumber(Person person);
	public String regPhoneNumberWithPerson(List<PhoneNumber> list);
	public List<Person> loadPersonAndHisPhoneNumbers();
	public List<PhoneNumber> loadPhoneNumberWithPerson();
}