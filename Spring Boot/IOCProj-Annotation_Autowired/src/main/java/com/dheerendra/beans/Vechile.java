package com.dheerendra.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vechile
{
	private Engine engg;

	/*@Autowired
	public void setEngg(Engine engg) {
		this.engg = engg;
	}*/
/*@Autowired
	public void assign(Engine engg) {
		this.engg=engg;
		
	}
*/
	@Autowired
	public Vechile(Engine engg) {
	
		this.engg = engg;
	}


	@Override
	public String toString() {
		return "Vechile [engg=" + engg + "]";
	}
	
	
}