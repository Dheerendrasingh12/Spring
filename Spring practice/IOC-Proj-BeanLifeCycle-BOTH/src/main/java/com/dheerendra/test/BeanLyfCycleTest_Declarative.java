package com.dheerendra.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.Check_Voting_Declarative;

public class BeanLyfCycleTest_Declarative {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Check_Voting_Declarative vote=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/dheerendra/cfgs/declarativeapplicationContext.xml");
		
		vote=(Check_Voting_Declarative) factory.getBean("cve");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=scn.nextLine();
		System.out.println("enter your age");
		int no=scn.nextInt();
		System.out.println("enter address");
		String addr=scn.nextLine();
		scn.nextLine();
		vote.setName(name);
		vote.setAge(no);
		vote.setAddrs(addr);
		System.out.println(vote.checkVotingCreteria());
		factory.destroySingleton("cve");
		
	}

}
