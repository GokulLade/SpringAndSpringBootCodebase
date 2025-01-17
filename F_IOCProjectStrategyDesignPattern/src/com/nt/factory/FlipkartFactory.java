package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstance(String courierType)
	{
		Courier courier=null;
		
		if(courierType.contentEquals("dtdc"))
		{
			courier= new DTDC();
		}
		else if(courierType.equalsIgnoreCase("BlueDart"))
		{
			courier=new BlueDart();
		}
		else
		{
			throw new IllegalArgumentException("Invalid courier type");
		}
		
		//Create target class object
		Flipkart flipkart= new Flipkart();
		flipkart.setCourier(courier);
		
		
		return flipkart;
		
	}
	
}
