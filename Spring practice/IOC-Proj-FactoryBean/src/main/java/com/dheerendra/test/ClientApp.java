package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.ScheduleRemainder;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ScheduleRemainder sch=null;
		
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		
		sch=ctx.getBean("sch",ScheduleRemainder.class);
		
			System.out.println(sch);
	}

}
