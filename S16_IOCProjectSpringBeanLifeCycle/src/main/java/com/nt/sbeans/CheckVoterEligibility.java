package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("cve")
public class CheckVoterEligibility {

	@Value("${voter.id}")
	private Integer id;
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	
	private Date verfiedOn;
	
	//init lifecycle method
	@PostConstruct
	public void init()
	{
		//initialize the left over properties that is not participate in injection
		verfiedOn=new Date();
		
		//Validating the properties 
		if(id==null || name==null || age<=0)
		{
			throw new IllegalArgumentException("Set correct value for Properties");
		}
	}
	
	//Business Logic method
	public String checkElgibility()
	{
		if(age>=18)
		{
			return name+" You are eligible for voting verified on "+verfiedOn;
		}
		else
		{
			return name+" You are not eligible for voting verified on "+verfiedOn;
		}
	}
	
	//Destroy life cycle method
	@PreDestroy
	public void destroy()
	{
		//nullification of the bean properties
		id=null;
		name=null;
		age=null;
		verfiedOn=null;
	}
	
	
}
