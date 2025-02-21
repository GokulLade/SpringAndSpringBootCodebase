package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("hotel")
@ToString
public class Hotel {

	//Direct Value
	@Value("101")
	
	//Getting Value from properties file
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.addr}")
	private String hotelAddr;
	@Value("${hotel.contact}")
	private String mobileNumber;
	
	@Value("${customer.name}")
	private String customerName;
	
	//SPEL for Arithmetic Expression
	@Value("#{menucard.pohaPrice+menucard.vadaPavPrice}")
	private Float billAmount;
	
	//System properties value
	@Value("${os.name}")
	private String osName;
	@Value("${user.name}")
	private String windowsUser;
	
	//Environment variable values
	@Value("${path}")
	private String pathData;
}
