package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator {

	@Autowired
	private LocalTime lt; // HAS-A property
	
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
