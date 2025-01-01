package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime lt; // HAS-A property
	
	// Using setter method for setter Injection
	public void setLt(LocalTime lt) 
	{
		this.lt = lt;
	}

	//Business method
	public String generateWishMessage(String user) 
	{

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
