package com.nt.sbeans;

public interface Engine {
	
	public String getEngineType();
	
	default void print()
	{
		System.out.println("In Interface");
	}

}
