package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IAuthService;
@Component
public class AuthRunner implements CommandLineRunner {

	@Autowired
	IAuthService authService;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			System.out.println(authService.isUserValid("Gokul", "9112"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
