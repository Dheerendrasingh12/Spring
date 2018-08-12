package com.dheerendra.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class Date_Test implements FactoryBean<Date>{
	private int date;
	private int month;
	private int year;
	public Date_Test(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public Date getObject() throws Exception {
		System.out.println("DFB: getObject()");
		return new Date(year,month,date);
	}
	public Class<?> getObjectType() {
		System.out.println("DFB:getObjectType()");
		return Date.class;
		
	}
	public boolean isSingleton() {
	System.out.println("DFB:isSingleton()");
		return true;
				}
	
	
	

}
