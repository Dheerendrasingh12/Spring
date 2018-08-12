package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.dheerendra.beans.WishGenerator;

public class ClientTest {
		
	public static void main(String[] args) {
		System.out.println("ClientApp:main(-)");
		String result=null;
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		
		WishGenerator bean=factory.getBean("wsg",WishGenerator.class);
		result=bean.generatorWishMsg("DHeerendra");
		
		
 System.out.println(result);
	}
}				
