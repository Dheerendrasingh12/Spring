package com.dheerendra.bean;

import java.util.Date;

public class Dept {
	private int deptno;
	private String dname;
	private Date dop;
	public Dept(int deptno, String dname, Date dop) {
	System.out.println("Dept-3-param constructor");
		this.deptno = deptno;
		this.dname = dname;
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", dop=" + dop + "]";
	}
	

}
