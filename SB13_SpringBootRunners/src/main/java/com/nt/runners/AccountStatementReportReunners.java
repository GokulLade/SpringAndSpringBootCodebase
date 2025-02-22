package com.nt.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class AccountStatementReportReunners implements ApplicationRunner , Ordered{

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		System.out.println("ApplicationRunner Interface Imp Class..!");
		
		//No-Optional args Values
		System.out.println("Non-Optional Values :"+args.getNonOptionArgs());
		
		//Optional args Values
		Set<String> optionNames = args.getOptionNames();
		optionNames.forEach((name)->{
			System.out.println(name+" "+args.getOptionValues(name));
		});

	}

	//Order for Execution 
	@Override
	public int getOrder() 
	{
		return 20;
	}

}
