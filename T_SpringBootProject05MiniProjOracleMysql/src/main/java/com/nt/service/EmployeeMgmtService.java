package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	
	//Getting DAO class Object
	@Autowired
	
	@Qualifier("dao") //Loose coupling
	IEmployeeDAO empDAO;

	//Retrieval Operation on Employee Table
	@Override
	public List<Employee> fetchEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception 
	{
		
		//Use of DAO
		List<Employee> list=empDAO.showEmployeeByDesgs(desg1, desg2, desg3);
		
		//Calculating gross salary and Net salary(Business Logic)
		list.forEach(emp->{
						emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.4));
						emp.setNetSalary(emp.getSalary()-(emp.getGrossSalary()*0.15));
						
						} );
		
		
		return list;
	}

	

	
	//Inserting Record in to Employee Table
	@Override
	public String registerEmployee(Employee emp) throws Exception 
	{
		//Declaring variable for storing result
		int result=0;
		
		//Calculating GrossSalary and NetSalary using Salary and set into Employee Object(Business Logic)
		emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.4));
		emp.setNetSalary(emp.getSalary()-(emp.getGrossSalary()*0.15));
		
		//Use of DAO
		result=empDAO.insertEmployeeData(emp);
		
		return (result==0)?"Employee Not Registred..!":"Employee Registred";
	}
}
