package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {

	public static void main(String[] args) 
	{
		//Get target class object using factory pattern
		Flipkart flipkart=FlipkartFactory.getInstance("dtdc");

		//Calling business method
		String bill=flipkart.shopping(new String[] {"Shirt","Pant","Kite"}, new double[] {2000,1500,300});
		
		//Printing the Bill
		System.out.println(bill);
		
	}

}
