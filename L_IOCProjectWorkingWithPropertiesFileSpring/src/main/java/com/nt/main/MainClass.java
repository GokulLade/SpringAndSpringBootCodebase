package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonInfo;

public class MainClass {

	public static void main(String[] args) 
	{
		//Creating IOC Container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Getting PersonInfo class object
		PersonInfo person=ctx.getBean("pDetail",PersonInfo.class);
		
		//Printing the Result
		System.out.println(person);
		
		//closing the IOC container
		ctx.close();

	}

}
