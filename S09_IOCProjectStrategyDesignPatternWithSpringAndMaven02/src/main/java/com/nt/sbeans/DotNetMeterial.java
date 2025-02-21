package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dMeterial")
public class DotNetMeterial implements ICourseMaterial {

	public DotNetMeterial() {
		System.out.println("DotNetMeterial.DotNetMeterial()");
	}

	
}
