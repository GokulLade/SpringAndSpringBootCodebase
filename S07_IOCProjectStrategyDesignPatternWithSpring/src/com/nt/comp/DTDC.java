package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("courier")
public final class DTDC implements Courier{

	@Override
	public String deliver(int oid) 
	{
		return oid+" Order delivared by DTDC";
	}

}
