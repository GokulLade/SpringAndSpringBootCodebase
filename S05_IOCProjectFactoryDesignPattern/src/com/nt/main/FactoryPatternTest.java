package com.nt.main;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) 
	{
		Bike bike1=BikeFactory.getInstance("standard");
		bike1.drive();
		System.out.println("------------------------------------");
		
		Bike bike2=BikeFactory.getInstance("sports");
		bike2.drive();
		System.out.println("-------------------------------------");
		
		Bike bike3=BikeFactory.getInstance("electric");
		bike3.drive();
		System.out.println("-------------------------------------");
		
		Bike bike4=BikeFactory.getInstance("bullet");
		bike4.drive();

	}

}
