package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.Vechile;

public class ClientApp {
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		
		Vechile vch=factory.getBean("vch",Vechile.class);
		System.out.println(vch);
	}
}
