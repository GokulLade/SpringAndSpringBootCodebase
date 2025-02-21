package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class PSpringBootProject01DependencyInjectionApplication {

    //Getting the Pre-defined spring bean[class] object (Dependent class object)
    @Bean(name = "ld")
    public LocalDate getDate()
	{
		return LocalDate.now();
	}

	public static void main(String[] args) 
	{
		//Creating IOC container
		ApplicationContext ctx=SpringApplication.run(PSpringBootProject01DependencyInjectionApplication.class);
		
		//Getting Bean object ref
		SeasonFinder sf=ctx.getBean("sf",SeasonFinder.class);
		
		//Calling Business Method
		String msg=sf.getSeason();
		
		//Printing the Result
		System.out.println(msg);
		
		//Closing the IOC container
		//Type casting is required because ApplicationContext interface does not have close() method
		((ConfigurableApplicationContext) ctx).close();
	}

}
