package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("dEngine")
	public IEngine engine;
	
	public void jounery(String from, String to)
	{
		System.out.println("Vehicle.jounery()");
	}
	
}
