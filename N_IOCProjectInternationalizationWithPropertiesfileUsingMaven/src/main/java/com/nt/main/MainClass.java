package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class MainClass {

	public static void main(String[] args)
	{
		//Creating IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Getting language code from user
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the language code");
		String lancode=sc.nextLine();
		
		System.out.println("Enter the country code");
		String countrycode=sc.nextLine();
		
		//Preparing Local object having language code and country code
		@SuppressWarnings({ "deprecation", "unused" })
		Locale local1= new Locale(lancode,countrycode); //deprecation
		
		Locale local2 = Locale.of(lancode,countrycode);//alternate
		
		//reading the message from the local specific properties file using the ctx.getMessage() method
		String msg1=ctx.getMessage("intro.msg",new String[]{}, local2);
		String msg2=ctx.getMessage("welcome.msg",new String[]{}, local2);
		String msg3=ctx.getMessage("course.msg",new String[]{}, local2);
		String msg4=ctx.getMessage("goodby.msg",new String[]{}, local2);
		
		System.out.println(msg1+"\n"+msg2+"\n"+msg3+"\n"+msg4);
		
		//close IOC container
		ctx.close();
	}

}
