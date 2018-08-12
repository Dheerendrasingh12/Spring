package com.dheerendra.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Viechle {

	@Autowired
	@Qualifier("e1")
	private Engine eng;
/*
	@Autowired(required=true)
	public Viechle(Engine eng) {
		this.eng = eng;
	}

	@Autowired(required=true)
	public void setEng(Engine eng) {
	System.out.println("setEng");
		this.eng = eng;
	}
	@Autowired(required=true)
	public void assEng(Engine eng) {
	System.out.println("assEng");
		this.eng = eng;
	}
*/	@Override
	public String toString() {
		return "Viechle [eng=" + eng + "]";
	}
	
	
	
	

	

	
	
	
	
	
}
