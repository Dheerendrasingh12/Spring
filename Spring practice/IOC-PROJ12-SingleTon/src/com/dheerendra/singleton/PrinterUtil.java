package com.dheerendra.singleton;

public class PrinterUtil {
	private static PrinterUtil instance;

	public static PrinterUtil getInstance() {
		if(instance==null)
			instance = new PrinterUtil();
		return instance;
	
	}

	public PrinterUtil() {
	System.out.println("0-param constructor");
	System.out.println(" instance constrctor "+instance);
	}
	
	
	
}
