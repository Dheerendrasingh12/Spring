package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.bean.Viechle;

public class ClientApp {
	
public static void main(String[] args) {
	System.out.println("Client App");
	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

	reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
	Viechle vch=factory.getBean("viechle",Viechle.class);
	
	vch.move();
	
			
}
}
