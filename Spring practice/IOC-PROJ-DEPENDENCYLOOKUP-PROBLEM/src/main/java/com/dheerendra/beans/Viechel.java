package com.dheerendra.beans;

import org.springframework.context.ApplicationContext;

public class Viechel {

	private String beanId;

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	public void entertainment() {
		System.out.println("Car music system is playing");
	}
	
	public void blowHorn() {
		System.out.println("Car is blowing horn");
	}
	
	public void move(ApplicationContext ctx)
	{
		System.out.println("viechle move");
		
		Enginee eng=null;
		
		eng=ctx.getBean(beanId,Enginee.class);
		
		eng.start();
		System.out.println("Viechel Moved");
		
	
	}
	
}
