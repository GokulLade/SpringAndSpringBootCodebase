package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class ClientApp {

	public static void main(String[] args) {
		
		//Creating IOC container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Getting vehicel Object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		
		//Calling Busines method
		vehicle.jounery("Hyderbad", "Pune");
		
		//Closing IOC container
		ctx.close();
		
	}

}
