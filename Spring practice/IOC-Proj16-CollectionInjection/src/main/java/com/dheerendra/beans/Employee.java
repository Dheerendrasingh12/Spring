package com.dheerendra.beans;

import java.util.Properties;

public class Employee {

	private Properties empDes;

	public Properties getEmpDes() {
		return empDes;
	}

	public void setEmpDes(Properties empDes) {
		this.empDes = empDes;
	}

	@Override
	public String toString() {
		return "Employee [empDes=" + empDes + "]";
	}
	
}
