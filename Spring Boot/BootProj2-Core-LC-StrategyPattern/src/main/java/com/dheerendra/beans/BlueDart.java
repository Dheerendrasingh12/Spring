package com.dheerendra.beans;


public class BlueDart implements Courier{

	public String deliver(int orderId) {
		
		return "Blue Dart: delivering order with OrderId "+orderId;
		
	}

	
}
