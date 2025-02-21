package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wm")
public class WishMessage {

	@Autowired
	private LocalTime lt;

	public String getMessage() {
		int hour = lt.getHour();

		if (hour >= 0 && hour <= 11) {
			return "Good Morning";
		} else if (hour >= 12 && hour <= 16) {
			return "Good Afternoon";
		} else {
			return "Good Night";
		}

	}
}
