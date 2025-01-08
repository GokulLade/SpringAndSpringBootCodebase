package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.BulletBike;
import com.nt.comps.ElectricBike;
import com.nt.comps.SportBike;
import com.nt.comps.StanderdBike;

public class BikeFactory {
	
	//Static factory method having factory pattern logic
	public static Bike getInstance(String bikeType)
	{
		Bike bike=null;
		
		if(bikeType.equalsIgnoreCase("standard"))
			bike =new StanderdBike();
		
		else if(bikeType.equalsIgnoreCase("sports"))
			bike =new SportBike();
		
		else if(bikeType.equalsIgnoreCase("electric"))
			bike =new ElectricBike();
		
		else if(bikeType.equalsIgnoreCase("bullet"))
			bike =new BulletBike();
		
		else 
			throw new IllegalArgumentException("Invalid Bike Type");
		
		return bike;
		
	}

}
