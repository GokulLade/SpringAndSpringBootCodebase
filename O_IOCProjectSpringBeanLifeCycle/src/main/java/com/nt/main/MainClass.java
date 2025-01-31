package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CheckVoterEligibility;

public class MainClass {

	public static void main(String[] args) 
	{
		//Creating IOC container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Getting Spring bean
		CheckVoterEligibility cve=ctx.getBean("cve",CheckVoterEligibility.class);
		
		try 
		{
			//Calling business method
			String msg=cve.checkElgibility();
			
			//Printing the message
			System.out.println(msg);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		

		//closing IOC container
		ctx.close();
	}

}
