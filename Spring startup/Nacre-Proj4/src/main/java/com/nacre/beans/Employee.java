
        package com.nacre.beans;

import java.util.Date;
import java.util.Set;

public class Employee {
	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
	
}
