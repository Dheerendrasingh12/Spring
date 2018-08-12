package com.dheerendra.bean;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date>{

	private int year;
	private int month;
	private int date;
	public DateFactoryBean(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	public Date getObject() throws Exception {
		System.out.println("DFB: getObject()");
		return new Date(year-1900,month,date);
	}
	public Class<?> getObjectType() {
		System.out.println("DFB:getObjectType");
		return Date.class;
	}
	public boolean isSingletob() {
		System.out.println("DFB: isSingleton");
		return false;
	}
	
	
}
