package com.dheerendra.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable
{
	private int sno;
	private String name,address;
	public StudentDTO(int sno, String name, String address) {
		this.sno = sno;
		this.name = name;
		this.address = address;
	}
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
	
}
