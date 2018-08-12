
package com.dheerendra.strategyPattern;

public class Vechile {

	private Engine engine;
	
	public Vechile() {
		System.out.println("o-param constructor");
	}
	
	public void setEngine(Engine engine) {
		System.out.println("Engine Set");
		this.engine = engine;
	}

	public void move() {
		engine.start();
		System.out.println("Vechiel is moved");
	}
	
	public void parked() {
		engine.stop();
		System.out.println("Vechine is parked");
	}
}
