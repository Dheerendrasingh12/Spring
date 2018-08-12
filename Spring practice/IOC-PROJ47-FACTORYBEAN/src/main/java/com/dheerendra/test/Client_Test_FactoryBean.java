package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.bean.ScheduleRemainder;

public class Client_Test_FactoryBean {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ScheduleRemainder scr=null;
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		scr=ctx.getBean("scr",ScheduleRemainder.class);
		scr.remainder1();
	}
}
