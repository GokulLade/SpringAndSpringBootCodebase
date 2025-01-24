package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pDetail")
public class PersonInfo {

	@Value("${p.fname}")
	private String firstName;
	@Value("${p.lname}")
	private String lastName;
	@Value("${p.gender}")
	private String gender;
	@Value("${p.email}")
	private String email;
	@Value("${p.phoneno}")
	private Long phno;
	
	@Override
	public String toString() 
	{
		return "PersonInfo [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", email="
				+ email + ", phno=" + phno + "]";
	}
	
	

}
