package com.dheerendra.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dheerendra.bean.Vechile;

public class SPTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Vechile vechile =null;
		
		factory=new XmlBeanFactory(new ClassPathResource("com/dheerendra/cfgs/applicationContext.xml"));
		vechile=factory.getBean("vechile",Vechile.class);
		vechile.move();
		vechile.parked();
	}
	
}
