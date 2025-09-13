package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IJobSeekerService;

@Component
public class JobSeekerRunner implements CommandLineRunner {

	@Autowired
	private IJobSeekerService jsService;

	@Override
	public void run(String... args) throws Exception {
//		try {
//
//			JobSeeker js = new JobSeeker("Ram", "Pune", LocalDateTime.of(2002, 5, 12, 03, 10), LocalTime.of(03, 10),
//					LocalDate.now());
//			String msg = jsService.regJobSeeker(js);
//			System.out.println(msg);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//				
//			jsService.getAllJobSeeker().forEach(System.out::println);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		try {
			
			float jsAge= jsService.getJsAge(1);
			System.out.println("JobSeeker Age is: "+jsAge);

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
