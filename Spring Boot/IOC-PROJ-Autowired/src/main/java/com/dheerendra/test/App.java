package com.dheerendra.test;

import java.nio.file.FileSystemNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dheerendra.beans.Amazon;

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
    	Amazon amz=ctx.getBean("amazon",Amazon.class);
    	System.out.println(amz);
    	amz.shopping(new String[] {"love","flower"});
    	((AbstractApplicationContext) ctx).close();
    	
    
    }
}
