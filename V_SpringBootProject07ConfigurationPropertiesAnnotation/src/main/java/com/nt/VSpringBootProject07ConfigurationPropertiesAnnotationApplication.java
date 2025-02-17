package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.PersonInfo;

@SpringBootApplication
public class VSpringBootProject07ConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) 
	{
		//Access the IOC container
		ApplicationContext ctx = SpringApplication.run(VSpringBootProject07ConfigurationPropertiesAnnotationApplication.class, args);
		
		//Getting Spring Bean
		PersonInfo perInfo=ctx.getBean("pInfo",PersonInfo.class);
		
		//Printing Result
		System.out.println(perInfo);
	}

}
