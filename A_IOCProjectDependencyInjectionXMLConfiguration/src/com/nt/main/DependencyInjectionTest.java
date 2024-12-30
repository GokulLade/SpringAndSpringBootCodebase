package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) 
	{
		System.out.println("DependencyInjectionTest.main(Start)");
		
		//create the IOC container
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get Target spring bean class object ref from the IOC container
		Object obj=ctx.getBean("wmg");
		
		//Type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		
		//Invoke the business method
		String result=generator.generateWishMessage("Gokul");
		
		//Printing the result
		System.out.println(result);
		
		//closing the IOC container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main(End)");
		
		

	}

}
