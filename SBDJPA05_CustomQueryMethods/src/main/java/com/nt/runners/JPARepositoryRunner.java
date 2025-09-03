package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Component
public class JPARepositoryRunner implements CommandLineRunner {

	@Autowired
	private IDoctorRepository docRepo;

	@Override
	public void run(String... args) throws Exception {
		try {

			Doctor doctor = docRepo.getDoctorByName("okul");
			if (doctor == null)
				System.out.println("Name not found!!");
			else {
				System.out.println(doctor + " ");
			}

			Object data = docRepo.getDoctorDataByName("Gokul");
			if (data == null)
				System.out.println("Name not found!!");
			else {
				Object[] row = (Object[]) data;
				for (Object d : row) {
					System.out.println(d + " ");
				}
			}

			Double income = docRepo.getDoctorIncomeByName("Gokul");
			if (income == null)
				System.out.println("Name not found!!");
			else {
				System.out.println(income);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
