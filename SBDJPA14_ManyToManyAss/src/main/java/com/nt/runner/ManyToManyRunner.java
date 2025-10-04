package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Faculty;
import com.nt.entity.Student;
import com.nt.service.ICollegeMgmtService;

@Component
public class ManyToManyRunner implements CommandLineRunner {

	@Autowired
	private ICollegeMgmtService clgService;

	@Override
	public void run(String... args) throws Exception {
		try {
			// Student class object
			Student s1 = new Student("Gokul", "Hyd", "Java");
			Student s2 = new Student("Ram", "Pune", ".Net");
			Student s3 = new Student("Chetan", "MP", "Cpp");

			// Faculty class object
			Faculty f1 = new Faculty("Ravi", "Hyd", "Java");
			Faculty f2 = new Faculty("Kishor", "Pune", "Cpp");

			// Assign Student to Faculty
			f1.getStudents().add(s1);
			f1.getStudents().add(s2);
			f2.getStudents().add(s1);
			f2.getStudents().add(s2);
			f2.getStudents().add(s3);

			// Assign Faculty to Student
			s1.getFaculties().add(f1);
			s1.getFaculties().add(f2);
			s2.getFaculties().add(f1);
			s2.getFaculties().add(f2);
			s3.getFaculties().add(f2);

			// Invoke service method
			String msg = clgService.regDetailUsingFacultiesInfo(Arrays.asList(f1, f2));
			System.out.println(msg);

		} catch (Exception e) {
				e.printStackTrace();
		}
	}

}
