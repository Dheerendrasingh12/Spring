package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.service.ServiceOperation;

public class Direct_JDBC_Template {
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ServiceOperation ser=null;
		ctx=new AnnotationConfigApplicationContext(Configuration.class);
		ser=ctx.getBean("empService",ServiceOperation.class);
		
		
		System.out.println("emp COunt "+ser.fetchEmpCount());
		System.out.println("emp salary "+ser.fetchEmpSalary(7499));
		System.out.println("All emp details "+ser.fetchDetails(7499));
		System.out.println("emp list "+ser.listEmpDetails("CLERK"));
	//	System.out.println("emp registration "+ser.reg_empDetails(12, "Dheerendra", "Java"));
		
		((AbstractApplicationContext) ctx).close();
	}

}
