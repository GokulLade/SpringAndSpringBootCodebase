package com.nt.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("payroll-controller")
public class PayrollMgmtOperationControler {

	//Getting Employee Data
	@Autowired
	private IEmployeeMgmtService empService;
	
	//Retrieval Operation on Employee Table
	public List<Employee> showEmployeeByDesgs(String desg1,String desg2,String desg3) throws Exception
	{
		//Use Service
		List<Employee> list=empService.fetchEmployeeByDesgs(desg1, desg2, desg3);
		return list;
	}
	
	//Inserting Record in to Employee Table
	
	public String processEmployee(Employee emp) throws Exception
	{
		//Use Service
		String result=empService.registerEmployee(emp);
		
		return result;
	}
	
}
