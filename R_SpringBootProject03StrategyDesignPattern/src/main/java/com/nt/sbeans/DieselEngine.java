package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements Engine {

	@Override
	public String getEngineType() 
	{
		return "Engine Work using Diesel..!";
	}

}
