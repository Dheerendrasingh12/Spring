package com.dheerendra.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("engg")


public class DTDC 
{
	@Autowired
	private Date dd;

	@Value("New York")
	private String location;

	public DTDC() {
		System.out.println("0-param Constructor");
	}

	public void deliver(int oid) {
		System.out.println("Order Deliver "+oid +" Date "+dd );
	}
	@Override
	public String toString() {
		return "DTDC [dd=" + dd + ", location=" + location + "]";
	}
	
	
	
	
}
