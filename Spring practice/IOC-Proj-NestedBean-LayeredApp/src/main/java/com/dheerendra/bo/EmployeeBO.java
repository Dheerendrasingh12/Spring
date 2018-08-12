package com.dheerendra.bo;

public class EmployeeBO {

	private int empno;
	private String ename;
	private String job;
	private int deptno;
	private int sal;
	
	public EmployeeBO(int empno, String ename, String job, int deptno, int sal) {

		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.deptno = deptno;
		this.sal = sal;
	}
	public int getEmpno() {
		
		return empno;
	}
	public void setEmpno(int empno) {
	
		this.empno = empno;
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
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
