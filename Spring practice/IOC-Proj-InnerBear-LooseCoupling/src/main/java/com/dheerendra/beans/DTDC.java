package com.dheerendra.beans;

public class DTDC implements Courier {
	
	
	public DTDC() {
		System.out.println("DTDC 0-param Construcor");
	
	}

	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return "DTDC is ready to deliver product of "+orderId;
	}

}
