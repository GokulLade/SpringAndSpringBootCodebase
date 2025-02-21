package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class USpringBootProject06ValueAnnotationSpel {

	public static void main(String[] args) 
	{
		//Creating IOC container
		ApplicationContext ctx=SpringApplication.run(USpringBootProject06ValueAnnotationSpel.class, args);
		
		//Getting Bean from IOC container
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		
		//Printing Result
		System.out.println(hotel);
		
	}

}
