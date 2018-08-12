package com.nacre.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nacre.beans.Contractor;

public class Customer {
	public static void main(String[] args) {
		
		XmlBeanFactory factory=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nacre/cfgs/applicationContext.xml"));
		
		Contractor con=factory.getBean("con",Contractor.class);
		System.out.println(con);
	
	}

}
