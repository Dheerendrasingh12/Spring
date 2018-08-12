package com.dheerendra.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("vch")
public class Viechle {
	private Engine eng;

	@Inject

	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "Viechle [eng=" + eng + "]";
	}
	
	
}
