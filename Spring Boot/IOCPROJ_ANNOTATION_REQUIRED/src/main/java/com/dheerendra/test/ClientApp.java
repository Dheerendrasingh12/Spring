package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dheerendra.beans.Robot;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Robot rt = null;

		ctx = new FileSystemXmlApplicationContext("src/main/java/com/dheerendra/cfgs/applicationContext.xml");
		rt = ctx.getBean("robot", Robot.class);
		System.out.println(rt);
	}
}
