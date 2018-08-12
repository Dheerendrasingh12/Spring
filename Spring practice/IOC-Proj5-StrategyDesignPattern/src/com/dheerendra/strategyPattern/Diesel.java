package com.dheerendra.strategyPattern;

public final class Diesel implements Engine {

	public Diesel(){
		System.out.println("Diesel engine 0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("Deisel Engine Start");
	}

	@Override
	public void stop() {
		System.out.println("Deisel Engine stop");
	}

}
