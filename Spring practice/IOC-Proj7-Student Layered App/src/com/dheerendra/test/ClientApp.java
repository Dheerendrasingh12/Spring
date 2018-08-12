package com.dheerendra.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dheerendra.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=null;
		
		factory=new XmlBeanFactory(new ClassPathResource("com/dheerendra/cfgs/applicationContext.xml"));
		StudentController control=factory.getBean("stcon",StudentController.class);
		System.out.println(control.process("11", "singh", "98", "96", "99"));
	}
}
