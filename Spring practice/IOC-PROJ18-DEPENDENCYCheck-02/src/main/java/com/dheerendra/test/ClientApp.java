package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.Student;

public class ClientApp {
public static void main(String[] args) {
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
	Student st=(Student) factory.getBean("stud");
	System.out.println(st);
}
}
