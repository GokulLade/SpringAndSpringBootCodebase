package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired
	private LocalDate ld;
	
	
	//Business Method
	public String getSeason()
	{
		//Getting month value
		int month=ld.getMonthValue();
		
		if(month>=3 && month<=6)
		{
			return "Summer Season";
		}
		else if(month>=7 && month<=10)
		{
			return "Rainy Season";
		}
		else
		{
			return "Winter Season";
		}
	}
	
	
}
