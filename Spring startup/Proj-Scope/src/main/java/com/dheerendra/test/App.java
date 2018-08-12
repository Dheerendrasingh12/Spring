package com.dheerendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.beans.Computer;


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
    	Computer com=ctx.getBean("com",Computer.class);
    	System.out.println("Both Singleton "+com);
    	System.out.println(com.hashCode());
    	Computer com1=ctx.getBean("com",Computer.class);
    	System.out.println(com1.hashCode());
    	System.out.println(com.hashCode()==com1.hashCode());
  
      	ApplicationContext ctx1=null;
    	ctx1=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
    	Computer com2=ctx.getBean("coms",Computer.class);
    	System.out.println("processor protoype "+com2);
    	System.out.println(com2.hashCode());
    	Computer com3=ctx.getBean("coms",Computer.class);
    	System.out.println(com3.hashCode());
    	System.out.println(com2.hashCode()==com3.hashCode());
  
    
      	ApplicationContext ctx2=null;
    	ctx2=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
    	Computer com4=ctx.getBean("comp",Computer.class);
    	System.out.println("Computer protoype "+com4);
    	System.out.println(com4.hashCode());
    	Computer com5=ctx.getBean("comp",Computer.class);
    	System.out.println(com5.hashCode());
    	System.out.println(com4.hashCode()==com5.hashCode());
  
    	
    	ApplicationContext ctx3=null;
    	ctx3=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
    	Computer com6=ctx.getBean("compp",Computer.class);    	System.out.println("Both protoype "+com6);
    	System.out.println(com6.hashCode());
    	Computer com7=ctx.getBean("compp",Computer.class);
    	System.out.println(com7.hashCode());
    	System.out.println(com6.hashCode()==com7.hashCode());
  
    	((AbstractApplicationContext) ctx).close();
    }
}
