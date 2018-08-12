package com.dheerendra.beans;

import java.util.Date;

public class WishGenerator {
	private String name;
	private Date date;

	public WishGenerator(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public String wishGeneratorMsg() {
		return "WishGenerator [name=" + name + ", date=" + date + "]";
	}

}
