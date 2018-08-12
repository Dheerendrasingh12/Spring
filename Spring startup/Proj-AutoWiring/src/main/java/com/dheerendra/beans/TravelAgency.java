package com.dheerendra.beans;

public class TravelAgency {
	private int travelAgencyId;
	private String agencyName;
	private String ownerName;
	private String location;
	private NacreBus bus;
	public void setTravelAgencyId(int travelAgencyId) {
		this.travelAgencyId = travelAgencyId;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setBus(NacreBus bus) {
		this.bus = bus;
	}
	@Override
	public String toString() {
		return "TravelAgency [travelAgencyId=" + travelAgencyId + ", agencyName=" + agencyName + ", ownerName="
				+ ownerName + ", location=" + location + ", bus=" + bus + "]";
	}
	
	

}
