package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public final class Flipkart {

	@Autowired
	@Qualifier("transporter")
	private Courier courier;

	public String shopping (String items[],double price[])
	{
		//Adding the bill amount
		double billAmount=0.0;
		for(double p:price)
		{
			billAmount+=p;
		}
		
		//Generating random order id
		int oid=new Random().nextInt(1000);
		
		//Deliver the product using courier
		String msg=courier.deliver(oid);
		
		//Returning bill 
		return Arrays.toString(items)+"Items with bill amount is: "+billAmount+" "+msg;
		
	}
}
