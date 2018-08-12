package com.dheerendra.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.dheerendra.service.LoanService;

public class ApplicatinContext_ClientApp {
	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);

	ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/dheerendra/cfgs/applicationContext.xml");
//	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("com/dheerendra/cfgs/applicationContext.xml"));
	BeanFactoryPostProcessor bfpp=ctx.getBean("pfc",PropertyPlaceholderConfigurer.class);
	
	LoanService service=ctx.getBean("ser",LoanService.class);
	System.out.println("Enter Number");
	int no=scn.nextInt();
	System.out.println("Enter Name");
	String name=scn.nextLine();
	scn.nextLine();  
	System.out.println("Enter Principal");
	float prin=scn.nextFloat();
	System.out.println("Enter Rate");
	float rate=scn.nextFloat();
	System.out.println("Enter Time");
	float time=scn.nextFloat();
	
	float intamt=service.calculate(no,name,prin,rate,time);
	System.out.println(intamt);
}
}
