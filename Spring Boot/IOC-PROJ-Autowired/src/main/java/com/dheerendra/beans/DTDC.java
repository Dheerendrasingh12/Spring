package com.dheerendra.beans;

public class DTDC {

	private String location;

	public void setLocation(String location) {
		this.location = location;
	}
	public void deliver(int oid) {
		System.out.println("Dtdc order "+oid+"is deliverd");
		
	}
	@Override
	public String toString() {
		return "DTDC [location=" + location + "]";
	}
	 
}
