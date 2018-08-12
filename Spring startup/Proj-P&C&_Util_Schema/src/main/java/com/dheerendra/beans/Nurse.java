package com.dheerendra.beans;

import java.util.List;

public class Nurse {
	private String nurseId;
	private String nurseName;
	private String dept;
	private List<Patient> patientList;
	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}
	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}
	@Override
	public String toString() {
		return "Nurse [nurseId=" + nurseId + ", nurseName=" + nurseName + ", dept=" + dept + ", patientList="
				+ patientList + "]";
	}
	

}