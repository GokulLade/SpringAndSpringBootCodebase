package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) 
	{
		System.out.println("DependencyInjectionTest.main(Start)");
		
		//create the IOC container

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get Target spring bean class object ref from the IOC container
		Object obj1=ctx.getBean("wmg");
		
		//Type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj1;
		
		//Invoke the business methods
		String result=generator.generateWishMessage("Gokul");

		//Printing the result
		System.out.println(result);
		
		//closing the IOC container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main(End)");

	}

}
