package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.DBOpertaiton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ctx=null;
    	ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
 
    	DBOpertaiton db=ctx.getBean("db",DBOpertaiton.class);
    	System.out.println(db);
    	((AbstractApplicationContext) ctx).close();
    	
    }
}
