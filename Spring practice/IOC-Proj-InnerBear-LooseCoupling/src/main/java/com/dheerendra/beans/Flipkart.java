package com.dheerendra.beans;

import java.util.Random;

public class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart 0-param Constructor");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("FlipKart setCourier Method");
		this.courier=courier;
	}
	
	public String onlineShopping(String item[]) {
		Random rad=null;
		int orderid=0;
		String status=null;
		rad=new Random();
		orderid=rad.nextInt(121212);
		
		status=courier.deliver(orderid);
		
		return status+" BIll Amount for order id "+orderid+"is 10120";
		
		
	}
	
	
}
