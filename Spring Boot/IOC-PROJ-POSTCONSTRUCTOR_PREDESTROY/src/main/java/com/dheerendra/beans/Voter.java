package com.dheerendra.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Named("vt")
@Scope(value="singleton")
public class Voter {
	@Value(value="Dheerendra")
	private String name;
	
	@Value("20")
	private int age;
	
	@PostConstruct
	public void myInit() {
		System.out.println("voter myInit");
		if(name==null || age<=0) {
			throw new IllegalArgumentException("Please enter age and name");
		}
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter :  myDestroy");
		name=null;
		age=0;
		
	}
	
	public String checkVotingEligibilty() {
		if(age<18)
			return name+ " u r not eligible to vote";
		else
			return name+" u r eligible for vote";
	}

}
