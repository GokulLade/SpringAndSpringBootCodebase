package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IOtoMService;

import jakarta.transaction.Transactional;

@Component
public class OtoMRunner implements CommandLineRunner {

	@Autowired
	private IOtoMService otomservice;

	@Transactional
	@Override
	public void run(String... args) throws Exception {

//		try {
//			List<Object[]> persons = otomservice.showPersonAndHisPhoneNumber();
//			persons.forEach(row -> {
//				System.out.println(Arrays.toString(row));
//			});
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
			List<Object[]> persons = otomservice.showPhoneNumberAndPerson();
			persons.forEach(row -> {
				System.out.println(Arrays.toString(row));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
