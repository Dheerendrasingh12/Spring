package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.bean.EMp;

public class P_C_NameSpace_Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EMp emp=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		emp=(EMp) factory.getBean("emp");
		
		System.out.println(emp.toString());
	}
}
