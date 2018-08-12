package com.dheerendra.test;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.dto.TicketDTO;
import com.dheerendra.service.RailwayService;

public class Batch_Insertion_App 
{
    public static void main( String[] args )
    {
    	Scanner scn=null;
    	ApplicationContext ctx=null;
    	TicketDTO dto=null;
    	List<TicketDTO> listDTO=null;
    	
    	RailwayService ser=null;
    	
    	int groupSize=0;
    	
    	listDTO=new ArrayList<>();
    	scn=new Scanner(System.in);
    	
    	System.out.println("enter group size");
    	groupSize=scn.nextInt();
    	
    	for(int i=0;i<groupSize;i++) {
    		System.out.println("enter "+(i+1)+ " Passenger Details");
    		dto=new TicketDTO();
    		
    		System.out.println("enter pnr ::");
    		
    		dto.setPnr(scn.nextInt());
    		System.out.println("enter train number");
    		dto.setTrainNo(scn.nextInt());
    		
    		System.out.println("enter Passenger Name::");
    		dto.setPassName(scn.next());
    		
    		System.out.println("Enter Source ");
    		dto.setSource(scn.next());
    		
    		System.out.println("enter desitination");
    		dto.setDest(scn.next());
    		
    		listDTO.add(dto);
    		
    		
    	}
    	
    	ctx=new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");
    	
    	ser=ctx.getBean("railService",RailwayService.class);
    	
    	System.out.println(ser.performGroupTicketReservation(listDTO));
    	((AbstractApplicationContext) ctx).close();
    	
    		
    }
}
