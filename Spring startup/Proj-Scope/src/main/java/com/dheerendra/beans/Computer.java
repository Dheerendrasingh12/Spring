package com.dheerendra.beans;

public class Computer {

	private String Manufacture;
	private String screenSize;
	private String ramSize;
	private String romSize;
	private String hardDisk;
	private Processor processor;
	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	public void setRomSize(String romSize) {
		this.romSize = romSize;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Computer \nManufacture=" + Manufacture + "\\tnscreenSize=" + screenSize + "\n\t ramSize=" + ramSize
				+ "\n\t romSize=" + romSize + "\n\t hardDisk=" + hardDisk + "\n\t processor=" + processor ;
	}
	
}
