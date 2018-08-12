package com.dheerendra.beans;

public class BlueDart {

	public BlueDart() {
	
		System.out.println("BlueDart 0-param constructor");
	}
	
	public String deliver(int orderid) {
		return "BlueDart is ready to deliver products of "+orderid;
		
	}

	
		
}
