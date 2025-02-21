package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	@Autowired
	@Qualifier("jMeterial")
	public ICourseMaterial courseMaterial;
	
	
	
	public Student() {
		System.out.println("Student.Student()");
	}



	public void preparation()
	{
		System.out.println("Student.preparation()");
	}
	
}
