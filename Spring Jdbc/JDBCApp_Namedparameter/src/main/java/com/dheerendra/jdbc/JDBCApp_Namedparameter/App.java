package com.dheerendra.jdbc.JDBCApp_Namedparameter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.service.EMPService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfg/applicationContext.xml");
    	EMPService empService=ctx.getBean("ser",EMPService.class);
    	System.out.println("emp "+empService.searchNameByNO(7499));
    	
 
    	
    	
    	
    }
}
