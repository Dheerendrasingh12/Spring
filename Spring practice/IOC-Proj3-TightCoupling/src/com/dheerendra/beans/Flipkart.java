package com.dheerendra.beans;

import java.util.Random;

public class Flipkart {
	
	private DTDC dtdc;
	public Flipkart() {
		
		System.out.println("0-param Flipkart()");
	}
	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}

	public String purchase(String items[]) {
		Random rad=new Random();
		
		int orderId=rad.nextInt(1212);
		String status=dtdc.deliver(orderId);
		return status+" Bill Amount for order id "+orderId+" is 7000";
	}
		
}
