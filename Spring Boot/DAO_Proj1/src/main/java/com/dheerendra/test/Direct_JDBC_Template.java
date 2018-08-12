package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.service.ServiceOperation;

public class Direct_JDBC_Template {
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ServiceOperation ser=null;
		ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
		
		ser=ctx.getBean("ser",ServiceOperation.class);
		
		System.out.println("emp COunt "+ser.fetchEmpCount());
		System.out.println("emp salary "+ser.fetchEmpSalary(7499));
		System.out.println("All emp details "+ser.fetchDetails(7499));
		System.out.println("emp list "+ser.listEmpDetails("CLERK"));
	//	System.out.println("emp registration "+ser.reg_empDetails(12, "Dheerendra", "Java"));
	}

}
