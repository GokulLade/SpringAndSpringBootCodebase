package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controler.PayrollMgmtOperationControler;
import com.nt.model.Employee;

@SpringBootApplication
@ImportResource("com/nt/config/applicationContext.xml")
public class SSpringBootProject04LayerenMini02{

	public static void main(String[] args) throws Exception 
	{
		try(
		//Creating IOC container
		ConfigurableApplicationContext ctx=SpringApplication.run(SSpringBootProject04LayerenMini02.class, args);
				
		//Creating Scanner class Object
		Scanner sc=new Scanner(System.in);
		)
		{
			
		//Getting Spring Bean
		PayrollMgmtOperationControler controller=ctx.getBean("payroll-controller",PayrollMgmtOperationControler.class);
		
		//Taking Input From user
		System.out.println("Enter Employee Name: ");
		String ename=sc.next();
		System.out.println("Enter Employee Designation: ");
		String edesg=sc.next();
		System.out.println("Enter Employee Salary: ");
		double esal=sc.nextDouble();
		System.out.println("Enter Employee Depatment: ");
		int edept=sc.nextInt();
		
		//Creating Employee Object
		Employee emp=new Employee();
		//Setting Value into employee properties
		emp.setEname(ename);
		emp.setDesg(edesg);
		emp.setSalary(esal);
		emp.setDeptno(edept);
		
		
		//Calling Business Method
		String result=controller.processEmployee(emp);
		
		//Printing the result 
		System.out.println(result);
		
		}
		catch(Exception e)
		{
			
			System.out.println("Internal Problem");
			e.printStackTrace();
		}
		
	}

}
