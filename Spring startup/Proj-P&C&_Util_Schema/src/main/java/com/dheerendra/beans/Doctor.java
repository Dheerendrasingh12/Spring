package com.dheerendra.beans;

import java.util.List;

public class Doctor {
	private String name;
	private String specialist;
	private String dept;
	private List<Patient> patients;
	private List<Nurse> nurse;
	public Doctor(List<Patient> patients, List<Nurse> nurse) {
		
		this.patients = patients;
		this.nurse = nurse;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void treatment(String oper) {
		System.out.println(patients.get(1));
		System.out.println(" treatement "+oper);
		System.out.println(" nurse Details"+nurse.get(1));
		System.out.println("doctor "+name);
		
	}
	
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", specialist=" + specialist + ", dept=" + dept + ", patients=" + patients
				+ ", nurse=" + nurse + "]";
	}
	
}