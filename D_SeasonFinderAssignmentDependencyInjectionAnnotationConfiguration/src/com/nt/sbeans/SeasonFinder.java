package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("season")
public class SeasonFinder {

	@Autowired
	private Date date;// HAS-A property
	
	
	//Business method
	public String getSeason()
	{
		int month=date.getMonth();// return 0-11
		System.out.println("Month is: "+month);
		
		if(month>=3 && month<=6) return "Summer Season";
		else if(month>=7 && month<=10) return "Monsoon Season";
		else  return "Winter Season";
	}
}
