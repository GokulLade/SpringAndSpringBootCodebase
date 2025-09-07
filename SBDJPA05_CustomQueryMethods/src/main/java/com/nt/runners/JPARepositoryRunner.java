package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IDoctorRepository;

@Component
public class JPARepositoryRunner implements CommandLineRunner {

	@Autowired
	private IDoctorRepository docRepo;

	@Override
	public void run(String... args) throws Exception {
		try {

			System.out.println("Local Date and Time:" + docRepo.showSystemDateAndTime());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
