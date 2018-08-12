package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.Tour_Agent;


public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Tour_Agent agent=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		//get Bean
		agent=factory.getBean("tagent",Tour_Agent.class);
		System.out.println(agent);

	}

}
