package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.Snapdeal;

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
    	
    	Snapdeal snp=ctx.getBean("snap",Snapdeal.class);
    	System.out.println(snp);
    	snp.shopping(new String[] {"Love","flower","necklace"});
    	
    	System.out.println("----------------------------------------------------");
    	Snapdeal snp1=ctx.getBean("snap",Snapdeal.class);
    	System.out.println(snp1);
    	snp1.shopping(new String[] {"Love","flower","ring"});
    	
    	
    	((AbstractApplicationContext) ctx).close();
    }
}
