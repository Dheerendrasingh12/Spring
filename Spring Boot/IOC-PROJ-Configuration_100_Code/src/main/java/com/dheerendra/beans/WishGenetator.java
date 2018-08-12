package com.dheerendra.beans;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("wish")
public class WishGenetator {
	@Resource
	private Calendar cal;

	private String generateMsg(String user) {
		int hr = 0;

		hr = cal.get(Calendar.HOUR_OF_DAY);
		if (hr <= 12)
			return "Good Morning " + user;
		else if (hr <= 16)
			return "Good AfterNoon " + user;

		else if (hr <= 20)
			return "Good Evening " + user;

		else
			return "Good Night " + user;

	}
}
