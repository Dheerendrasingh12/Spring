package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.TravelAgency;

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
    	TravelAgency ta=ctx.getBean("ta",TravelAgency.class);
    	System.out.println(ta);
    	((AbstractApplicationContext) ctx).close();
    	
    }
}
