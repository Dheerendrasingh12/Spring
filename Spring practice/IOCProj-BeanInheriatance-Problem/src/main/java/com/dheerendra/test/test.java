package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.Bike;

public class test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		
		Bike bk=factory.getBean("Ducati",Bike.class);
		System.out.println("Bike Details "+bk.toString());

		Bike bk1=factory.getBean("Ducati1",Bike.class);
		System.out.println("Bike Details "+bk1.toString());
	}
}
