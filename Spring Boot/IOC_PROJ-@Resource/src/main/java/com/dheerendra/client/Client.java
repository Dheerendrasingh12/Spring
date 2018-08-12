package com.dheerendra.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dheerendra.beans.Viechle;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/dheerendra/cfgs/applicationContext.xml");
		
		Viechle vch=null;
		vch=ctx.getBean("vch",Viechle.class);
		System.out.println(vch);
		ctx.getBean("vch");
		ctx.getBean("vch");
		((AbstractApplicationContext) ctx).close();
	}
}