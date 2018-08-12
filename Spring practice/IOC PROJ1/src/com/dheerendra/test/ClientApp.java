package com.dheerendra.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.dheerendra.beans.WishGenerator;

public class ClientApp {
public static void main(String[] args) {
	FileSystemResource res=new FileSystemResource("src/com/dheerendra/cfgs/applicationContext.xml");
	
	XmlBeanFactory factory=new XmlBeanFactory(res);
	WishGenerator bean=factory.getBean("wsg",WishGenerator.class);
	System.out.println(bean);
}
}
