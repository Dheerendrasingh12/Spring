package com.nacre.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nacre.beans.HelloWorld;

public class HelloWorldTest {
	public static void main(String[] args) {
		XmlBeanFactory factory=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nacre/cfgs/applicationContext.xml"));
		
		HelloWorld hw=factory.getBean(HelloWorld.class,"hello");
		System.out.println(hw);
		
		
	}

}
