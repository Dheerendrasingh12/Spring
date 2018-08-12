package com.dheerendra.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

public class Amazon {

	@Autowired
	private DTDC dtdc;

	@Autowired
	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}

	public void shopping(String item[]) {
		System.out.println(Arrays.toString(item)+" are shopped");
		dtdc.deliver(new Random().nextInt(2000));
		
	}
	@Override
	public String toString() {
		return "Amazon [dtdc=" + dtdc + "]";
	}
	
}
