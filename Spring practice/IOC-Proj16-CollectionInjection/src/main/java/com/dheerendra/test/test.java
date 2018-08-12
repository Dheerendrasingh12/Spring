package com.dheerendra.test;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.College;
import com.dheerendra.beans.Employee;
import com.dheerendra.beans.NullInjectionTest;
import com.dheerendra.beans.Student;
import com.dheerendra.beans.User;

public class test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");

		Student st = factory.getBean("st", Student.class);
		System.out.println(st.toString());
		
		User us=factory.getBean("user",User.class);
		System.out.println(us.toString());
		
		College clg=factory.getBean("col",College.class);
		System.out.println(clg.toString() );
		
		Employee emp=factory.getBean("emp",Employee.class);
		
		System.out.println(emp.toString());
		
		NullInjectionTest nij=factory.getBean("null",NullInjectionTest.class);
		System.out.println("Null injection "+nij.toString());
		
	}
}
