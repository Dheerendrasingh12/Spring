package com.dheerendra.beans;

public class RequestHandler {
	private static int count;

	public RequestHandler() {
		count++;
		System.out.println("Request handler 0-param constructor");
	}
	public void delgate(String data) {
		System.out.println("Handling Request "+count+" with recived data "+data);
	}
	

}
