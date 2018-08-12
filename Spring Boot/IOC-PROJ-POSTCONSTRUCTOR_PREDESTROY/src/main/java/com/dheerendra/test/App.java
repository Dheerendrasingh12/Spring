package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.Voter;

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
    	Voter vt=ctx.getBean("vt",Voter.class);
    	System.out.println(vt);
    	String status=vt.checkVotingEligibilty();
    	System.out.println("result "+status);
    	((AbstractApplicationContext) ctx).close();
    }
}
