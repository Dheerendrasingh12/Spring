package com.dheerendra.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dheerendra.beans.Flipkart;

public class TightCoupling_Test {

	public static void main(String[] args) {

		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/dheerendra/cfgs/applicationContext.xml"));
		
		Flipkart bean=factory.getBean("fpk",Flipkart.class);
		String billmsg=bean.purchase(new String[] {"shirt","mobile","books"});
		System.out.println(billmsg);
	}
}
