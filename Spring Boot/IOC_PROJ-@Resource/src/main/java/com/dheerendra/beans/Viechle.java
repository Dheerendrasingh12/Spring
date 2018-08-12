package com.dheerendra.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Named("vch")
@Scope("prototype")
public class Viechle {
	
	@Resource
	private Engine eng;
	/*
	public void setEng(Engine eng) {
		this.eng = eng;
	}
*/
	public Viechle() {
		System.out.println("viechle 0-param constructor");
	}
	
@Resource(name="eng1")
	public void assign(Engine eng) {
		this.eng=eng;
		
	}
/*
	public void setEng(Engine eng) {
		this.eng = eng;
	}
*/


	@Override
	public String toString() {
		return "Viechle [eng=" + eng + "]";
	}
	
	
}
