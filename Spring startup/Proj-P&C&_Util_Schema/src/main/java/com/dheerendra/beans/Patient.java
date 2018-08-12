package com.dheerendra.beans;

public class Patient {
	private int patientId;
	private String name;
	private String disease;
	public Patient(int patientId, String name, String disease) {
		this.patientId = patientId;
		this.name = name;
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", disease=" + disease + "]";
	}
	
}
