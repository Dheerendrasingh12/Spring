package com.dheerendra.beans;

import java.util.Arrays;

public class Tour_Plan {
	private String[] places;
	
	public Tour_Plan() {
		System.out.println("TourPlan:0-param constructor");
	}

	public void setPlaces(String[] places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + "]";
	}

}
