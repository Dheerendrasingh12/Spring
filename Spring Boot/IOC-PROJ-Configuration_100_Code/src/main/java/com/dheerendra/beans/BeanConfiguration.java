package com.dheerendra.beans;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.dheerendra.beans")
public class BeanConfiguration 
{
	static {
		System.out.println("Bean Configuration : Static Block");
	}
	public BeanConfiguration() {
		System.out.println("Bean Configuration 0-param block");
	}
	
	@Bean(name="cal")
	@Scope("singleton")
	@DependsOn("wish")
	
	public Calendar createCal() {
		System.out.println("bean Configurtaion : create Calendar");
		return Calendar.getInstance();
	}
	
}
