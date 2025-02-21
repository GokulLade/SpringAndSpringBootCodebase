package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	//Creating IOC container
       AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
       
       //Getting Student Object
       Student student= ctx.getBean("student",Student.class);
       
       //calling busines method
       student.preparation();
       
       //closing IOC container
       ctx.close();
       
    }
}
