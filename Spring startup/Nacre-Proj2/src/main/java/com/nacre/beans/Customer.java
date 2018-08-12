package com.nacre.beans;

import java.util.Date;

public class Customer {
	private int customerId;
	private String cusName;
	private long mobNo;
	private String email;
	private Date dob;
	private Address add;
	
	
	
	public Customer(int customerId, String cusName, long mobNo) {
		
		this.customerId = customerId;
		this.cusName = cusName;
		this.mobNo = mobNo;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public void setAdd(Address add) {
		this.add = add;
	}



	public int getCustomerId() {
		return customerId;
	}



	public String getCusName() {
		return cusName;
	}






	public long getMobNo() {
		return mobNo;
	}



	public String getEmail() {
		return email;
	}



	public Date getDob() {
		return dob;
	}



	public Address getAdd() {
		return add;
	}



	public void placeOrder(String itemName) {
		
			System.out.println("Customer Details");
			System.out.println(toString());
			System.out.println(" purchase item is "+itemName);
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cusName=" + cusName + ", mobNo=" + mobNo + ", email=" + email
				+ ", dob=" + dob + ", add=" + add + "]";
	}


}
