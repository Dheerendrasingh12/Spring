package com.dheerendra.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dheerendra.beans.Flipkart;

public class LooseCouplingTest {

	public static void main(String[] args) {
		
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/dheerendra/cfgs/applicationContext.xml"));
		
		Flipkart bean=factory.getBean("fpk",Flipkart.class);
		
		String billmsg=bean.onlineShopping(new String[] {"Computer","Laptop"});
		System.out.println(billmsg);
		
	}

}
