package com.dheerendra.test;

import com.dheerendra.singleton.PrinterUtil;

public class SingletonTest {
	
	public static void main(String[] args) {
		
	PrinterUtil pul1=null,pul2=null;
	pul1=PrinterUtil.getInstance();
	pul2=PrinterUtil.getInstance();
	System.out.println(pul1);
	System.out.println(pul2);
	System.out.println("pul1 hashcode "+pul1.hashCode()+" \t pul2 hashCode "+pul2.hashCode());
	
	System.out.println("Equals check "+(pul1==pul2));
	}
}
