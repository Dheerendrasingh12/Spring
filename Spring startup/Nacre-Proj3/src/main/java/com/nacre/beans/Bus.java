package com.nacre.beans;

public class Bus {

	private int busId;
	private String busName;
	private String engineType;
	private String engineModel;
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}
	public void driver(String name) {
		System.out.println(name+" drive "+busName+" bus id "+busId+" bus engine  type "+engineType+" bus model "+engineModel);
		
		

	}
	
}
