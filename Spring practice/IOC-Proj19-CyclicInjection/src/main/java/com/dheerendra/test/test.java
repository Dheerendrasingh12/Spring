package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.A;

public class test {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		
		A a1=factory.getBean("ab",A.class);
		
	}
}
