package com.dheerendra.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishGenerator {
	public String generateWishMessage(String name) {
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			return "Good Morning "+name;
		else if(hour<=16)
			return "Good Afternoon "+name;
		else if(hour<=20)
			return "GOod Evening "+name;
		else
			return "Good Night "+name;
		
		
	}
}
