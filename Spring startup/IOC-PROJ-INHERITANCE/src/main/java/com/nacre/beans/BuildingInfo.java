package com.nacre.beans;

import java.util.Date;

public class BuildingInfo {

	private double length;
	private double width;
	private double breadth;
	private String location;
	private long cost;
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "BuildingInfo [length=" + length + ", width=" + width + ", breadth=" + breadth + ", location=" + location
				+ ", cost=" + cost + "]";
	}
}
