package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.Doctor;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		Doctor doc=ctx.getBean("doc",Doctor.class);
		//System.out.println(doc);
		doc.treatment("Heart");
		((AbstractApplicationContext) ctx).close();
	}
}
