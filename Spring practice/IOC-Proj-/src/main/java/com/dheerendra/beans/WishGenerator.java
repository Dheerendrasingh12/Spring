package com.dheerendra.beans;

import java.util.Date;

public class WishGenerator {

	private String name;
	private Date date;

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String generatorWishMsg(String user) {
		int hour = 0;
		hour = date.getHours();
		if (hour <= 12)
			return "Good morning " + user;

		else if(hour<=16)
			return "Good  Afternoon "+user;
		
		else if (hour<=20)
			return "Good evening "+user;
		else
			return "Good Night "+user;	}

}
