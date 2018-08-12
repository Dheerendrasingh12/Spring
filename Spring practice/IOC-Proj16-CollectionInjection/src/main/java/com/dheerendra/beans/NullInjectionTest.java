package com.dheerendra.beans;

import java.util.Date;

public class NullInjectionTest {

	private int id;
	private String name;
	private Date dob;
	public NullInjectionTest(int id, String name, Date dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "NullInjectionTest [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
}
