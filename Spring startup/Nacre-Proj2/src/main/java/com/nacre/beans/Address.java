package com.nacre.beans;

public class Address {

	private int addId;
	private String lane1;
	private String lane2;
	private int pinCode;
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}
	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", lane1=" + lane1 + ", lane2=" + lane2 + ", pinCode=" + pinCode + "]";
	}
	
	
}
