package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IDoctorService;
@Component
public class DoctoreInfoRunner implements CommandLineRunner {

	@Autowired
	IDoctorService dService;
	@Override
	public void run(String... args) throws Exception {
		try {
			dService.getAllDoctorByIncome(10000.0, 20000.0).forEach(System.out::println);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
