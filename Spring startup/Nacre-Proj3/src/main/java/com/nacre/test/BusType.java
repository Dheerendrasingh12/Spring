package com.nacre.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nacre.beans.Bus;

public class BusType{
	public static void main(String[] args) {
		

		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		Bus b=ctx.getBean("bus1",Bus.class);
		System.out.println(b);
	}

}
