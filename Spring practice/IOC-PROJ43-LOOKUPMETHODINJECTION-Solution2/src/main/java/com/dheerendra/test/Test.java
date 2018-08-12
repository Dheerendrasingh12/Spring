package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.WebContatiner;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WebContatiner contatiner = null;
		ctx = new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");

		contatiner = ctx.getBean("web", WebContatiner.class);
		contatiner.delegateData("Dheerendra Singh");
		
		contatiner.delegateData("Dheerendra Love k");
	}
}
