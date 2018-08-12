package com.dheerendra.vo;

public class EmployeeVo {
	private String eno;
	private String sno;
	private String ename;
	private String job;
	private String deptno;
	private String salary;
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		System.out.println(eno+"==========");
		this.eno = eno;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
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
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeVo [eno=" + eno + ", sno=" + sno + ", ename=" + ename + ", job=" + job + ", deptno=" + deptno
				+ ", salary=" + salary + "]";
	}
	
	

}
