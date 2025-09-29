package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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

	@Override
	public String deletePersonWithPhoneNumber(Integer id) {

		Optional<Person> pid = perRepo.findById(id);
		if (pid.isPresent()) {
			Person person = pid.get();
			// Delete person
			perRepo.delete(person);

			return "Person deleted with phonenumbers!!";
		}

		return "Id is not found!!";

	}

	@Override
	public String removePhoneOfAPerson(Integer id) {

		Optional<Person> pId = perRepo.findById(id);
		if (pId.isPresent()) {
			Person person = pId.get();
			Set<PhoneNumber> phones = person.getPhones();
			phones.forEach(ph -> ph.setPerson(null));

			phnorepo.deleteAllInBatch(phones);

			return phones.size() + "PhoneNumber of :" + pId + " person id deleted!!";
		}

		return "Person not found!!";
	}

	@Override
	public String addNewPhoneNumberToPerson(Integer pid, PhoneNumber phNo) {

		Optional<Person> pId = perRepo.findById(pid);
		if (pId.isPresent()) {
			// Load the parent
			Person person = pId.get();

			// Load the child from Parent
			Set<PhoneNumber> phones = person.getPhones();

			// Add the parent to child
			phNo.setPerson(person);

			// Add new child to exiting child
			phones.add(phNo);

			// Add new child to parent
			person.setPhones(phones);

			// Save the Parent
			perRepo.save(person);

			return "New phone number is added to old person!!";

		}

		return "Person id not found!!";
	}

	@Override
	public String removePhoneNumberAndPerson(Integer pid) {

		Optional<Person> perId = perRepo.findById(pid);
		if (perId.isPresent()) {
			// Load the parent
			Person person = perId.get();

			// Load child from parent
			Set<PhoneNumber> phones = person.getPhones();

			// Delete the child and parent
			phones.forEach(phno -> {
				phnorepo.delete(phno);
			});

			return "PhoneNumber is deleted with Person!!";
		}

		return "Person not found!!";
	}

}
