package com.dheerendra.beans;

public class Bike {

	private String id;
	private String comp;
	private int engCC;
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", comp=" + comp + ", engCC=" + engCC + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getEngCC() {
		return engCC;
	}
	public void setEngCC(int engCC) {
		this.engCC = engCC;
	}
}
