package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vc")
public class Vehicle {

	@Autowired
	@Qualifier("engineType")
	private Engine engine;
	
	public void getVehicelInfo()
	{
		System.out.println("Vehicle Name is Spleder");
		System.out.println("Vehilce"+engine.getEngineType());
	}
	
}
