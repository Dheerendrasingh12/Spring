package com.dheerendra.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dheerendra.beans.FlipKart;

@SpringBootApplication
@ComponentScan(basePackages="com.dheerendra.beans")
public class BootProj2CoreLcStrategyPatternApplication {

	public static void main(String[] args) {
			
		ApplicationContext ctx=null;
		FlipKart flipkart=null;
		ctx=SpringApplication.run(BootProj2CoreLcStrategyPatternApplication.class, args);
		flipkart=ctx.getBean("flipkart",FlipKart.class);
		System.out.println(flipkart.Shopping(new String[] {"shirt","pant"}));
	
	}
}
