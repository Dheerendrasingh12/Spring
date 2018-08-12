package com.dheerendra.beans;

import java.util.Arrays;
import java.util.List;

public class Student {

	
	private int marks[];
	private List<String> names;
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", names=" + names + "]";
	}
	
}
