package com.nt;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	
	@Bean(name = "ltime")
	public LocalTime getLocalTimeObject()
	{
		return LocalTime.now();
	}

}
