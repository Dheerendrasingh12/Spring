package com.dheerendra.bean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.bean.Engine;

public class Viechle {

	private String enggId;

	public String getEnggId() {
		return enggId;
	}

	public void setEnggId(String enggId) {
		this.enggId = enggId;
	}

	public Viechle() {

		System.out.println("0-param constructor Vechile");
	}

	public void move() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");


		Engine eng=factory.getBean("enggId",Engine.class);
		
		eng.start();
		System.out.println("Veichle move ");
	}

}
