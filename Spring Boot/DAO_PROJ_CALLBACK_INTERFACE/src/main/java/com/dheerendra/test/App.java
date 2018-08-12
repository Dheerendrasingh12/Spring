package com.dheerendra.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.dto.EmployeeDTO;
import com.dheerendra.service.ListEmpService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=null;
    	ListEmpService ser=null;
    	EmployeeDTO dto=null;
    	List<EmployeeDTO> list=null;
    	ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
    	
    	ser=ctx.getBean("empService",ListEmpService.class);
    	
    	dto=ser.findEmpDetailsByNo(7499);
    	System.out.println("7499 emp Deatils "+dto.getNo()+"  "+dto.getName()+" "+dto.getJob()+" "+dto.getSal());
    
    	System.out.println("Clerk Desg Emp Details");
    	list=ser.findempDetailsByDesg("CLERK");
    	System.out.println("after service");
    	list.forEach(dt->{
    		System.out.println(dt.getNo()+" "+dt.getName()+" "+dt.getJob()+" "+dt.getSal());
    	});
    	((AbstractApplicationContext) ctx).close();
    }
}
