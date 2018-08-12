package com.dheerendra.beans;

import java.util.Map;

public class College {

	private Map<String, String>sub;
	private Map<?, ?>fphone;

	public Map<?, ?> getFphone() {
		return fphone;
	}

	public void setFphone(Map<?, ?> fphone) {
		this.fphone = fphone;
	}

	public Map<String, String> getSub() {
		return sub;
	}

	public void setSub(Map<String, String> sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "College [sub=" + sub + ", fphone=" + fphone + "]";
	}
	
}
