package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig;
import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) 
	{
		System.out.println("DependencyInjectionTest.main(Start)");
		
		//create the IOC container

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		SeasonFinder season=ctx.getBean("season",SeasonFinder.class);
		
		//Invoke the business methods
		String result=season.getSeason();

		//Printing the result
		System.out.println(result);
		
		//closing the IOC container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main(End)");

	}

}
