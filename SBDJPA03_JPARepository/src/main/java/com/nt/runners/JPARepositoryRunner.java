package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

@Component
public class JPARepositoryRunner implements CommandLineRunner {

	@Autowired
	private IDoctorService service;

	@Override
	public void run(String... args) throws Exception 
	{
		
		
//		try {
//			
//			
//			String msg = service.removeAllDoctorInBatch(Arrays.asList(11,22,33));
//			
//			System.out.println(msg);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
//		try {
//			
//			Doctor doctor=new Doctor();
//			doctor.setQly("MBBS");
//			
//			List<Doctor> list = service.findDoctorByExampleData(doctor, true, "income");
//			
//			list.forEach(System.out::println);
//		}
//		catch(Exception e)
//		{
//			
//		}
		
//		try {
//			Doctor doctor = service.showDoctorById(18);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		try {
			Doctor doctor = service.fetchDoctorById(18);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
