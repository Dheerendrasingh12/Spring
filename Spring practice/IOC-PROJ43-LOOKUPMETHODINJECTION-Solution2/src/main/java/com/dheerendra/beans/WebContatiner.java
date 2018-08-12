package com.dheerendra.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContatiner {
	private String beanId;

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public WebContatiner() {
		System.out.println("0-param constructor");
		}
	
	public void delegateData(String data) {
		ApplicationContext ctx=null;
		RequestHandler handler=null;
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		handler=ctx.getBean("rh",RequestHandler.class);
		
		handler.processingData(data);
	}
	

}
