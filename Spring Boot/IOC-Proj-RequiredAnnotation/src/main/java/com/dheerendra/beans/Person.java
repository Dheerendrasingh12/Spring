package com.dheerendra.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Person 
{
	private String name;
	private Date dob;
	private String add;
	
		@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", add=" + add + "]";
	}
}
