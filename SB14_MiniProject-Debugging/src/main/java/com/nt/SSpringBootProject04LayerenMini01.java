package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SSpringBootProject04LayerenMini01{

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Main method Start");
		
		//Creating IOC container
		SpringApplication.run(SSpringBootProject04LayerenMini01.class, args);
		
		System.out.println("Main method Ends");
	}

}
