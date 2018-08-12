package com.dheerendra.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dheerendra.beans.VoterChecking;

@SpringBootApplication
@ComponentScan(basePackages="com.dheerendra.beans")
public class BootProj2CoreLcStrategyPattern1Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		VoterChecking checking=null;
		ctx=SpringApplication.run(BootProj2CoreLcStrategyPattern1Application.class, args);
		
		checking=ctx.getBean("voter",VoterChecking.class);
		System.out.println(checking.checkVotingEligibility());
	
	
	}
}
