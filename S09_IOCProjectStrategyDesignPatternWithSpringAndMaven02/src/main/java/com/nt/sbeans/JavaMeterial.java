package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("jMeterial")
public class JavaMeterial implements ICourseMaterial {

	public JavaMeterial() {
		System.out.println("JavaMeterial.JavaMeterial()");
	}

	
}
