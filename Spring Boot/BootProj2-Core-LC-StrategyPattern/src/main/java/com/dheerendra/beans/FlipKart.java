package com.dheerendra.beans;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("flipkart")
public class FlipKart{

	@Resource(name="dtdc")
	private Courier courier;
	
	public String Shopping(String items[]) {
		
		Random random=null;
		int orderId=0;
		random=new Random();
		orderId=random.nextInt(1999);
		System.out.println(courier.deliver(orderId));
		return Arrays.toString(items)+" are dekuvered";
	}

}
