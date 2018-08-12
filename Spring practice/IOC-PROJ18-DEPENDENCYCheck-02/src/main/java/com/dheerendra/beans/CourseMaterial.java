package com.dheerendra.beans;

public class CourseMaterial {
	private String name;
	private int pageNum;
	public void setName(String name) {
		this.name = name;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	@Override
	public String toString() {
		return "CourseMaterial [name=" + name + ", pageNum=" + pageNum + "]";
	}
}
