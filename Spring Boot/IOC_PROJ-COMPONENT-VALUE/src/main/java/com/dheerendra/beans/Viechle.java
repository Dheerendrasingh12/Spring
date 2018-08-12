package com.dheerendra.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Viechle {
	@Autowired
	private Engine eng;

	@Override
	public String toString() {
		return "Viechle [eng=" + eng + "]";
	}
	
	
}
