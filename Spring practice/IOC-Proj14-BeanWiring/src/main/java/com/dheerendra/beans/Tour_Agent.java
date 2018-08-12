package com.dheerendra.beans;

public class Tour_Agent {
	private Tour_Plan tp;

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public Tour_Agent(Tour_Plan tp) {
		System.out.println("TravelAgent::1-param constructor");
		this.tp = tp;
	}

	public Tour_Agent() {
		System.out.println("TravelAgent::0-param constructor");
	}

	public void setTp(Tour_Plan tp) {
		System.out.println("TravelAgent::setTp(-)");
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravelAgent [tp=" + tp + ", name=" + name + "]";
	}

}
