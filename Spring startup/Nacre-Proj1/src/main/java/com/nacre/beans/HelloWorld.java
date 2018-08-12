package com.nacre.beans;

public class HelloWorld {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public HelloWorld(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Welcome " + name ;
	}
	
	
}
