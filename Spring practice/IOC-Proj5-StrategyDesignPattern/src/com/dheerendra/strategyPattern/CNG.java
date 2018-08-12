package com.dheerendra.strategyPattern;

public final class CNG implements Engine {

	public CNG(){
		System.out.println("CNG engine 0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("CNG Engine Start");
	}

	@Override
	public void stop() {
		System.out.println("CNG Engine stop");
	}

}
