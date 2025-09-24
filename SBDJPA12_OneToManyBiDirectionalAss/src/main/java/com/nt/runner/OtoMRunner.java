package com.nt.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IOtoMService;

@Component
public class OtoMRunner implements CommandLineRunner {

	@Autowired
	private IOtoMService otomservice;

	@Override
	public void run(String... args) throws Exception {
		// Parent Object
		Person per = new Person("Gokul", "Hyd");

		// Child Objects
		PhoneNumber ph1 = new PhoneNumber("Home", 434343434L, "JIO");
		PhoneNumber ph2 = new PhoneNumber("Office", 234234324L, "VI");

		// Link parent to child(Many to One)
		ph1.setPerson(per);
		ph2.setPerson(per);

		// Link child with parent(One to Many)
		per.setPhones(Set.of(ph1, ph2));

		try {
			String msg = otomservice.regPersonAndhisPhoneNumber(per);
			System.out.println(msg);

		} catch (Exception e) {
				e.printStackTrace();
		}
	}

}
