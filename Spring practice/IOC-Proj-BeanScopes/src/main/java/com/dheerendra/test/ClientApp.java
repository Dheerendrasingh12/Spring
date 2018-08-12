package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.bean.Viechle;

public class ClientApp {
	
public static void main(String[] args) {
	System.out.println("Client App");
	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

	reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
	Viechle vch1=factory.getBean("viechle",Viechle.class);
	Viechle vch2=factory.getBean("viechle",Viechle.class);
	System.out.println(vch1.hashCode()+"  "+vch2.hashCode());
	System.out.println(vch1==vch2);
			
}
}
