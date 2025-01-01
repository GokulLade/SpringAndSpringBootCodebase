package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrintingDateAndTime {
	
	//HAS-A properties
	private LocalTime lt;
	private LocalDate ld;
	
	// Using Constructor Injection
	public PrintingDateAndTime(LocalTime lt,LocalDate ld)
	{
		this.lt=lt;
		this.ld=ld;
	}
	
	//Business method-1
	public void printTime()
	{
		int hour=lt.getHour();
		int minute=lt.getMinute();
		int second=lt.getSecond();
		
		System.out.println("Time: "+hour+":"+minute+":"+second+":");
	}
	
	//Business method-1
	public void printDate()
	{
		int date=ld.getDayOfMonth();
		int month=ld.getMonthValue();
		int year=ld.getYear();
		System.out.println("Date: "+date+":"+month+":"+year+":");
	}

}
