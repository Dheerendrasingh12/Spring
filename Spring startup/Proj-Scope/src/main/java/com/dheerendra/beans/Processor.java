package com.dheerendra.beans;

public class Processor {
	private String processorType;
	private String capacity;
	private String speed;
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {       
		return "Processor \n\tprocessorType=" + processorType + "\n\t capacity=" + capacity + "\n\t speed=" + speed;
	}
	
}
