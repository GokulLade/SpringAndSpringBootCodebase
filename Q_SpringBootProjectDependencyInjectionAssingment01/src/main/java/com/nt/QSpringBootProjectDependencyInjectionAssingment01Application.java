package com.nt;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessage;

// Assignment-01: Develop the application to generate the wish message based on the current hour of the day

@SpringBootApplication
public class QSpringBootProjectDependencyInjectionAssingment01Application {

	// Creating Pre-defined class Object
	@Bean(name = "lt")
	public LocalTime getTime() {
		return LocalTime.now();
	}

	public static void main(String[] args) {
		// Creating IOC container
		ApplicationContext ctx = SpringApplication
				.run(QSpringBootProjectDependencyInjectionAssingment01Application.class, args);

		// Getting spring bean object
		WishMessage wm = ctx.getBean("wm", WishMessage.class);

		// Calling Business Method
		String msg = wm.getMessage();

		// Printing Message
		System.out.println(msg);

		// Closing the IOC container
		// Type casting is required because ApplicationContext interface does not have close() method
		((ConfigurableApplicationContext) ctx).close();
	}

}
