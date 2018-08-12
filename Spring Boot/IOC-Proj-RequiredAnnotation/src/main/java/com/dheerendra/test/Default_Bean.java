package com.dheerendra.test;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.Person;

public class Default_Bean {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		factory.addBeanPostProcessor(new RequiredAnnotationBeanPostProcessor());
		Person per=null;
		per=factory.getBean("per",Person.class);
		System.out.println(per);
	}
}
