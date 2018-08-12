package com.dheerendra.beans;

public class BloodDetails {
	float plasma;
	float rbc;
	float plate;
	public float getPlasma() {
		return plasma;
	}
	public void setPlasma(float plasma) {
		this.plasma = plasma;
	}
	public float getRbc() {
		return rbc;
	}
	public void setRbc(float rbc) {
		this.rbc = rbc;
	}
	public float getPlate() {
		return plate;
	}
	public void setPlate(float plate) {
		this.plate = plate;
	}
	@Override
	public String toString() {
		return "BloodBank [plasma=" + plasma + ", rbc=" + rbc + ", plate=" + plate + "]";
	}
	 

}
