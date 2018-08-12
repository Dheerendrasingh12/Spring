package com.dheerendra.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.Check_Voting_Declarative;

public class CheckVoting_Eliegibility {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Check_Voting_Declarative cv=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		//get Bean
		cv=ctx.getBean("cve",Check_Voting_Declarative.class);
		//invoke b.method
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=scn.nextLine();
		System.out.println("enter your age");
		int no=scn.nextInt();
		System.out.println("enter address");
		String addr=scn.nextLine();
		cv.setName(name);
		cv.setAge(no);
		cv.setAddrs(addr);
		System.out.println(cv.checkVotingCreteria());
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}
}