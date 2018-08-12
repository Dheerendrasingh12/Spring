package com.dheerendra.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ClentApp {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		
		Class c1=factory.getBean("c1",Class.class);
		System.out.println("c1 data  "+c1+" c1 class name "+c1.getClass());
		System.out.println("-------------------------------");
		Calendar c2=factory.getBean("c2",Calendar.class);
		System.out.println("c2 data "+c2+" c2 class "+c2.getClass());
		
		System.out.println("----------------------------");
		String s2=factory.getBean("s2",String.class);
		System.out.println("s2 data "+s2+" s2 class "+s2.getClass());
		
		System.out.println("--------------------------");
		String s3=factory.getBean("s3",String.class);
		
		System.out.println("s3 data "+s3+"s3 class "+s3.getClass() );
	
	}
}
