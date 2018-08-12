package com.dheerendra.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
//@Named("eng")
public class Engine {
private int id;
	
	private String type;

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}
	
	
	
}
