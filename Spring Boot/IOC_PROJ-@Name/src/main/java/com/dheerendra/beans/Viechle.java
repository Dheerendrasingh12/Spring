package com.dheerendra.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("vch")
public class Viechle {
	@Inject
	@Named("eng1")
	private Engine eng;
	
	@Override
	public String toString() {
		return "Viechle [eng=" + eng + "]";
	}
	
	
}
