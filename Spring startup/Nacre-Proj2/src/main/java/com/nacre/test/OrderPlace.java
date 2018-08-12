package com.nacre.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nacre.beans.Customer;

public class OrderPlace {
	public static void main(String[] args) {
		
		XmlBeanFactory factory= null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nacre/cfgs/applicationContext.xml"));
		
		Customer cus=(Customer) factory.getBean("cus");
		cus.placeOrder("Apple Laptop");
	}

}
