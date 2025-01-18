package com.nt.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("blueDart")
@Primary
public final class BlueDart implements Courier {

	@Override
	public String deliver(int oid) 
	{
		return oid+" Order delivared by BlueDart";
	}

}
