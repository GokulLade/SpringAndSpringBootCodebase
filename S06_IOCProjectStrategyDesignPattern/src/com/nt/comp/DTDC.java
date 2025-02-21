package com.nt.comp;

public final class DTDC implements Courier{

	@Override
	public String deliver(int oid) 
	{
		return oid+" Order delivared by DTDC";
	}

}
