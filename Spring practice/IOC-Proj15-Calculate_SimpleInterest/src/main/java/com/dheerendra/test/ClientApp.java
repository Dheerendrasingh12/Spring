package com.dheerendra.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dheerendra.controller.CustomerController;

public class ClientApp {

	public static void main(String[] args) {
	BeanFactory factory=null;
		
		factory=new XmlBeanFactory(new ClassPathResource("com/dheerendra/cfgs/applicationContext.xml"));
		CustomerController control=factory.getBean("ccon",CustomerController.class);
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Number");
		String cno=scn.nextLine();
		System.out.println("Enter Username");
		String cname=scn.nextLine();
		System.out.println("Enter Principal");
		String cprincipal=scn.nextLine();
		System.out.println("Enter Rate");
		String crate=scn.nextLine();
		System.out.println("Enter Time()");
		String ctime=scn.nextLine();
		
		System.out.println(control.process(cno,cname,cprincipal,crate,ctime));
	}
}
