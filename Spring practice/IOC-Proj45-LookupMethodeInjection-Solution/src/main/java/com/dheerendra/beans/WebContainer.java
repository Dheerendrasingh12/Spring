package com.dheerendra.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public abstract class WebContainer {

	public abstract RequestHandler getRequestHandler();{
		
	}

	public WebContainer() {
		System.out.println("WebContainer:: 0-param constructor");
	}
	
	public void delgateRequest(String data){
		RequestHandler handler=null;
		System.out.println("WebContainer : request recived with "+data+" and delegating hsandler");
		
		handler =getRequestHandler();
		handler.p
	}
}
