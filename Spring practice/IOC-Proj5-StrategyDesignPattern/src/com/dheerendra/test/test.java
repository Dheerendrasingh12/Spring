package com.dheerendra.test;

import com.dheerendra.factory.VechileFactory;
import com.dheerendra.strategyPattern.Vechile;

public class test {

	public static void main(String[] args) {
		Vechile vechile=null;
		
	//	vechile=VechileFactory.getInstance("Petrol");
		
		vechile=VechileFactory.getInstance("Diesel");
		
		vechile.move();
		vechile.parked();
	}

}
