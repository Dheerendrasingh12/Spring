package com.dheerendra.beans;

public class BloodBank {

	private String hospitalName;
	private String location;
	private BloodDetails blood;
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setBlood(BloodDetails blood) {
		this.blood = blood;
	}
	@Override
	public String toString() {
		return "BloodBank [hospitalName=" + hospitalName + ", location=" + location + ", blood=" + blood + "]";
	}
		
}
