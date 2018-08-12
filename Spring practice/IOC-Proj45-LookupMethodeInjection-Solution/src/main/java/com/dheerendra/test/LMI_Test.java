package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.WebContainer;

public class LMI_Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WebContainer container = null;
		ctx = new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");

		container = ctx.getBean("web", WebContainer.class);

		container.delegateRequest("Dheerendra Singh Feeling Love");
		
		container.delegateRequest("Sonu live in Hyderabad");
	}
}
