package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//Order for Execution 
@Order(-20)
public class SalesReportRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("CommandLineRunner Interface Imp Class..!");

		System.out.println("Command Line arguments are : "+Arrays.toString(args));

	}

}
