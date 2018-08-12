package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.dheerendra.beans.WishGenerator;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		
		WishGenerator bean = (WishGenerator) factory.getBean("w");
		System.out.println(bean.generateWishMessage("Dheerendra"));

	}
}
