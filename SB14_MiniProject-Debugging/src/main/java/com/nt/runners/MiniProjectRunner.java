package com.nt.runners;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controler.PayrollMgmtOperationControler;
import com.nt.model.Employee;
@Component
public class MiniProjectRunner implements CommandLineRunner {

	@Autowired
	PayrollMgmtOperationControler pmoc;
	
	@Override
	public void run(String... args) throws Exception 
	{
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
			List<Employee> showEmployeeByDesgs = pmoc.showEmployeeByDesgs(desg1, desg2, desg3);
			
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
