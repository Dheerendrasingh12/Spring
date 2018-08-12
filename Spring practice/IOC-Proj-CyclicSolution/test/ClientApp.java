package com.dheerendra.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dheerendra.bean.A;

public class ClientApp {
	public static void main(String[] args) {

BeanFactory factory=null;
		
		factory=new XmlBeanFactory(new ClassPathResource("com/dheerendra/cfgs/applicationContext.xml"));
	
	
	A a=factory.getBean("a",A.class);
	
	
	
	}
}
