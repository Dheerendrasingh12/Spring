package com.dheerendra.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.Player;

public class ClientApp {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/dheerendra/cfgs/applicationContext.xml");
		
		Player ply=(Player) factory.getBean("ckt");
		System.out.println("Enter Player Name ");
		ply.setName(scn.nextLine());
		
		ply.bowling();
		System.out.println("-------------------------------------");
		ply.fielding();

		System.out.println("-------------------------------------");
		ply.wicketKeeping();
		

		System.out.println("-------------------------------------");
		ply.strikeBall();
	}
	
}
