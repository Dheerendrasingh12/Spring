package com.dheerendra.beans;

public class RequestHandler {
	private static int count;

	public RequestHandler() {
		System.out.println("0-param constructor");
		count++;
	}
	
	public void processingData(String data) {
		System.out.println("handling Request no "+count+" with recieved data "+data);
	}
	

}
