package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dheerendra.beans.Vechile;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=null;
    	ctx=new FileSystemXmlApplicationContext("src/main/java/com/dheerendra/cfgs/applicationContext.xml");
    	
    	Vechile vch=ctx.getBean(Vechile.class,"viechle");
    	System.out.println(vch);
    }
}
