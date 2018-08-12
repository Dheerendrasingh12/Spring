package com.dheerendra.beans;

import java.util.Date;

public class WishGenerator {
	private Date date;
   static{
      System.out.println("WishMessageGenerator:: static block");	   
   }
   public WishGenerator() {
	System.out.println("WishMessageGenerator:: 0-param constructor");
  }
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator::setDate(-)");
		this.date = date;
	}
	
	public  String generateWishMessage(String user){
		   int hour=0;
		   //get current Hour
		   hour=date.getHours(); // gives current hour of the day
		   //write WishMessage
		   if(hour<=12)
			   return "GM::"+user;
		   else if(hour<=16)
			    return "GA::"+user;
		   else if(hour<=20)
			    return "GE::"+user;
		   else
			   return "GN::"+user;
	}//method
}//class
