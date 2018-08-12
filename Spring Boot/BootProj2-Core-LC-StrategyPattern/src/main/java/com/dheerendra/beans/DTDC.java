package com.dheerendra.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC implements Courier{

	public String deliver(int orderId) {
		
		return "DTDC: delivering order with OrderId "+orderId;
		
	}

	
}
