package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dheerendra.beans.Person;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		ctx = new FileSystemXmlApplicationContext("src/main/java/com/dheerendra/cfgs/applicationContext.xml");
		Person person = (Person) ctx.getBean("per");
		System.out.println(person);
		((AbstractApplicationContext) ctx).close();

	}
}
