package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.EngineeringCourse;

public class Client {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		
		EngineeringCourse eng=factory.getBean("ECE1yrs",EngineeringCourse.class);
		System.out.println(eng.toString());
	}
}
