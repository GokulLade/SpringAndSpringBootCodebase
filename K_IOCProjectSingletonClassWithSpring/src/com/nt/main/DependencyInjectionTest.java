package com.nt.main;

import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) 
	{

		// create the IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		//Getting the object 
		WishMessageGenerator wmg1=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wmg2=ctx.getBean("wmg",WishMessageGenerator.class);
		
		LocalTime lt1=ctx.getBean("ltime",LocalTime.class);
		LocalTime lt2=ctx.getBean("ltime",LocalTime.class);
		
		//Checking the reference of object
		System.out.println(wmg1.hashCode()+" "+wmg2.hashCode());
		System.out.println("wmg1==wmg2 : "+(wmg1==wmg2));
		
		System.out.println(lt1.hashCode()+" "+lt2.hashCode());
		System.out.println("lt1==lt2 : "+(lt1==lt2));
		
		// closing the IOC container
		ctx.close();

	}

}
