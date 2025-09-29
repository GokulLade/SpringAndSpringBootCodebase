package com.nt.service;

import java.util.List;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IOtoMService {

	public String regPersonAndhisPhoneNumber(Person person);
	public String regPhoneNumberWithPerson(List<PhoneNumber> list);
	public List<Person> loadPersonAndHisPhoneNumbers();
	public List<PhoneNumber> loadPhoneNumberWithPerson();
	public String deletePersonWithPhoneNumber(Integer id);
	public String removePhoneOfAPerson(Integer id);
	public String addNewPhoneNumberToPerson(Integer pid, PhoneNumber phNo);
	public String removePhoneNumberAndPerson(Integer pid);
	
}