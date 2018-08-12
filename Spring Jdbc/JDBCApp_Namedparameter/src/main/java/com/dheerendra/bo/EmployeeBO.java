package com.dheerendra.bo;

public class EmployeeBO {
	private int eno, salary;
	private String ename, job;

	public EmployeeBO(int eno, int salary, String ename, String job) {
		this.eno = eno;
		this.salary = salary;
		this.ename = ename;
		this.job = job;
	}



	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
