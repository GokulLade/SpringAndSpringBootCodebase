package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controler.PayrollMgmtOperationControler;
import com.nt.model.Employee;

@SpringBootApplication
public class SSpringBootProject04LayerenMini01{

	public static void main(String[] args) throws Exception 
	{
		
		//Creating IOC container
		ApplicationContext ctx=SpringApplication.run(SSpringBootProject04LayerenMini01.class, args);
		
		//Getting Spring Bean
		PayrollMgmtOperationControler controller=ctx.getBean("payroll-controller",PayrollMgmtOperationControler.class);
		
		//Printing Active Profile
		Environment env= ctx.getEnvironment();
		System.out.println("Profile Activated :"+Arrays.toString(env.getActiveProfiles()));
		
		//Taking Input From user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Designation-1");
		String desg1=sc.next();
		System.out.println("Enter Designation-2");
		String desg2=sc.next();
		System.out.println("Enter Designation-3");
		String desg3=sc.next();
		
		//Calling Business Method
		try(sc) 
		{
			//Getting Employee Data
			List<Employee> showEmployeeByDesgs = controller.showEmployeeByDesgs(desg1, desg2, desg3);
			
			//Printing Result
			showEmployeeByDesgs.forEach(emp1-> System.out.println(emp1));
			
		}
		catch(Exception e)
		{
			
			System.out.println("Internal Problem");
			e.printStackTrace();
		}
		
	}

}
