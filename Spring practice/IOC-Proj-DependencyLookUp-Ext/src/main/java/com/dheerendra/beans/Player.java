package com.dheerendra.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Player {
	private String name;
	private String beanId;

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void bowling() {
		System.out.println("player " + name + " is Bowling  ");
	}

	public void fielding() {
		System.out.println("player " + name + " is Fielding");
	}

	public void wicketKeeping() {
		System.out.println("player " + name + " is WicketKeeping");

	}

	public void strikeBall() {

		System.out.println("player " + name + " is Batting");
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");

		Batting bkt = (Batting) factory.getBean(beanId);
		bkt.strikeBall(name);
	}
}
