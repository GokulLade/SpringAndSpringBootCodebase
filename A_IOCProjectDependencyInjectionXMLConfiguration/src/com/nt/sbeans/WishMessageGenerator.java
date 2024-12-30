package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime lt; // HAS-A property

	public WishMessageGenerator() 
	{
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	// setter method for setter Injection
	public void setLt(LocalTime lt) 
	{
		System.out.println("WishMessageGenerator.setLt()");
		this.lt = lt;
	}

	//business method
	public String generateWishMessage(String user) 
	{
		System.out.println("WishMessageGenerator.generateWishMessage()");

		// get current hour of the day
		int hour = lt.getHour();// In 24 hrs format
		
		if (hour < 12)
			return "Good Morning:" + user;

		else if (hour < 16)
			return "Good Afternoon:" + user;

		else if (hour < 20)
			return "Good Evening:" + user;
		
		else
			return "Good Night:" + user;
	}

}
