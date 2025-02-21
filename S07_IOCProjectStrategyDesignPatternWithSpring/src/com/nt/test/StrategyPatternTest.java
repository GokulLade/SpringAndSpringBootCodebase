package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.Flipkart;
import com.nt.config.AppConfig;

public class StrategyPatternTest {

	public static void main(String[] args) 
	{
		//Creating IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		//Getting flipkart object
		Flipkart flipkart=ctx.getBean("flipkart",Flipkart.class);
		
		//Calling business method
		String bill=flipkart.shopping(new String[] {"Shirt","Pant","Kite"}, new double[] {2000,1500,300});
		
		//Printing the Bill
		System.out.println(bill);
		
		ctx.close();
		
	}

}
