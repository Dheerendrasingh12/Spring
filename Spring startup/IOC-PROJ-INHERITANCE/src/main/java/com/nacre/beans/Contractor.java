package com.nacre.beans;

import java.util.List;

public class Contractor {

	private String conName;
	private List<BuildingInfo> buildingInfo;
	private long mobileNo;

	@Override
	public String toString() {
		return "Contractor [conName=" + conName + ", buildingInfo=" + buildingInfo + ", mobileNo=" + mobileNo + "]";
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public List<BuildingInfo> getBuildingInfo() {
		return buildingInfo;
	}

	public void setBuildingInfo(List<BuildingInfo> buildingInfo) {
		this.buildingInfo = buildingInfo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Contractor() {

		System.out.println("zero param-----");
	}

	
}
