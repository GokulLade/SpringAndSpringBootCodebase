package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pMeterial")
public class PythonMeterial implements ICourseMaterial {

	public PythonMeterial() {
		System.out.println("PythonMeterial.PythonMeterial()");
	}

	
}
