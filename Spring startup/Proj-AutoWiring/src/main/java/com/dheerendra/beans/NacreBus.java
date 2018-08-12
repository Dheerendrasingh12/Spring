package com.dheerendra.beans;

public class NacreBus {

	private int noOfEmployee;
	private int noOfTravelAgency;
	private String ownerName;
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public void setNoOfTravelAgency(int noOfTravelAgency) {
		this.noOfTravelAgency = noOfTravelAgency;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "NacreBus [noOfEmployee=" + noOfEmployee + ", noOfTravelAgency=" + noOfTravelAgency + ", ownerName="
				+ ownerName + "]";
	}
	
}
