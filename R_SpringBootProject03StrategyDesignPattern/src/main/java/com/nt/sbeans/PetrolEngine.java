package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements Engine {

	@Override
	public String getEngineType() 
	{
		return"Engine works using Petrol";
	}

}
