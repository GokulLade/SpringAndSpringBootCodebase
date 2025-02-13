package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/config/applicationContext.xml")
public class RSpringBootProject03StrategyDesignPatternApplication {

	public static void main(String[] args) 
	{
		//Creating IOC Container
		ApplicationContext ctx = SpringApplication.run(RSpringBootProject03StrategyDesignPatternApplication.class, args);
		
		//Getting spring bean Object
		Vehicle vc = ctx.getBean("vc",Vehicle.class);
		
		//Calling Business Method
		vc.getVehicelInfo();
		
		
	}

}
