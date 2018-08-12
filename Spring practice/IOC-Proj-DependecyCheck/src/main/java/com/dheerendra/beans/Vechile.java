package com.dheerendra.beans;

public class Vechile {

	private Engine engine;
	private int id;
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Vechile [engine=" + engine + ", id=" + id + "]";
	}
	
}
