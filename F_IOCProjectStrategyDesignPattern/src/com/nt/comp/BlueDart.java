package com.nt.comp;

public final class BlueDart implements Courier {

	@Override
	public String deliver(int oid) 
	{
		return oid+" Order delivared by BlueDart";
	}

}
