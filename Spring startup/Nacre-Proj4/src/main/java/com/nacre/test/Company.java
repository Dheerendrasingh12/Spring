package com.nacre.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nacre.beans.Project;

public class Company {
	public static void main(String[] args) {
		

		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nacre/cfgs/applicationContext.xml");
Project proj=		ctx.getBean("proj",Project.class);
		System.out.println(proj);
	}

}
