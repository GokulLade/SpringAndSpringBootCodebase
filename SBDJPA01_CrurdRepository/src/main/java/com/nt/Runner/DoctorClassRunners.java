package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

@Component
public class DoctorClassRunners implements CommandLineRunner {

	@Autowired
	private IDoctorService docService;
	
	@Override
	public void run(String... args) throws Exception 
	{
		try {
			
			Doctor doctor= new Doctor("Gokul", "MD", 353434D);
			
			String msg=docService.registerDoctor(doctor);
			
			System.out.println(msg);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
