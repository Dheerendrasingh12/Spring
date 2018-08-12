package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.Vechile;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vechile vch=null;
		
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		vch=ctx.getBean("vch",Vechile.class);
		
		
		vch.move();
			
		vch.blowHorn();
		vch.entertaiment();
		
		((AbstractApplicationContext) ctx).close();
		
		
	}
}
