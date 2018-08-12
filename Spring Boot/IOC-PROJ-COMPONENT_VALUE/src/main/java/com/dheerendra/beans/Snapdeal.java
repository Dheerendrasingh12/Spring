package com.dheerendra.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="snap")
@Scope("singleton")
public class Snapdeal 
{
	private DTDC dtdc;

	public Snapdeal() {
		System.out.println("0- param snapdeal");
	}

	public DTDC getDtdc() {
		return dtdc;
	}
	@Autowired
	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}
	
	public void shopping(String item[]) {
		System.out.println(Arrays.toString(item) + " are shopped");
		dtdc.deliver(new Random().nextInt(5000));
		
	}

	@Override
	public String toString() {
		return "Snapdeal [dtdc=" + dtdc + "]";
	}
	
	
	
	

}


