package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.MyContainer;

public class LMIProblemTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyContainer contain=null,contain1=null;
		
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		
		contain=ctx.getBean("container",MyContainer.class);
		contain.processRequestHandler("Dheerendra Singh Again Feeling Love with k");
		 System.out.println("-------------------------------");
	       
		contain.processRequestHandler("Next week we are going to indore");
		
		contain1=ctx.getBean("container",MyContainer.class);
		contain1.processRequestHandler("Sonu is the faster biker");
		
		((AbstractApplicationContext) ctx).close();
		
	}

}
