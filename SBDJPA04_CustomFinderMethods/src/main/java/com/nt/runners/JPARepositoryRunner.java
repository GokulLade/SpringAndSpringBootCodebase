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
	public void run(String... args) throws Exception 
	{
		docRepo.findByQly("MBBS").forEach(System.out::println);
	}

}
