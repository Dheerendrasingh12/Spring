package com.dheerendra.beans;

public class Student {

	private int sno;
	private String sname;
	private CourseMaterial course;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void setCourse(CourseMaterial course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + "]";
	}
}
