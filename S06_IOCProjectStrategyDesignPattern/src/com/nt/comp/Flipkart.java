package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	private Courier courier;

	public void setCourier(Courier courier) 
	{
		this.courier = courier;
	}
	
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
