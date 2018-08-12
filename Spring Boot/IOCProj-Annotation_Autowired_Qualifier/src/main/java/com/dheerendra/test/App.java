package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dheerendra.beans.Viechle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=null;
    	ctx=new FileSystemXmlApplicationContext("src/main/java/com/dheerendra/cfgs/applicationContext.xml");
    	
    	Viechle vhc=ctx.getBean("viechle",Viechle.class);
    	System.out.println(vhc);
    }
}
