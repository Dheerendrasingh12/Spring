package com.dheerendra.factory;

import com.dheerendra.strategyPattern.CNG;
import com.dheerendra.strategyPattern.Diesel;
import com.dheerendra.strategyPattern.Engine;
import com.dheerendra.strategyPattern.Petrol;
import com.dheerendra.strategyPattern.Vechile;

public class VechileFactory {

	public static Vechile getInstance(String engineType) {
		Engine engine = null;
		Vechile vechile = null;

		if (engineType.equalsIgnoreCase("Diesel")) {
			engine = new Diesel();
			vechile = new Vechile();
			vechile.setEngine(engine);
		}
		else if(engineType.equalsIgnoreCase("Petrol")) {
			engine=new Petrol();
			vechile=new Vechile();
			vechile.setEngine(engine);
		}
		else if(engineType.equalsIgnoreCase("CNG")) {
			engine=new CNG();
			vechile=new Vechile();
			vechile.setEngine(engine);
			
		}
		else {
			System.out.println("As now no such type of engine");
		}
		return vechile;

	}
}
