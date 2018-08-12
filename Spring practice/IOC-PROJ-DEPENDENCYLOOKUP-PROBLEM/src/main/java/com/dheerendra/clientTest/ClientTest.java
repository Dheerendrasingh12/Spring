package com.dheerendra.clientTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.Enginee;
import com.dheerendra.beans.Viechel;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
	Viechel vch=null;
		ctx= new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		
		vch=ctx.getBean("vch",Viechel.class);
		vch.move(ctx);
		vch.blowHorn();
		vch.entertainment();
		
		((AbstractApplicationContext) ctx).close();
		
		
		
		
	}
}
