package com.nt.exception;

public class DoctorNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoctorNotFoundException()
	{
		
	}
	
	public DoctorNotFoundException(String msg)
	{
		super(msg);
	}

}
