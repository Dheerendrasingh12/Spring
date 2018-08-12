	package com.dheerendra.bo;

public class StudentBO {

	private int sno;
	private String name,address;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentBO(int sno, String name, String address) {
		this.sno = sno;
		this.name = name;
		this.address = address;
	}
	
}
