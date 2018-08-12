package com.dheerendra.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dheerendra.service.WishGenerator;
@SpringBootApplication
@ComponentScan(basePackages="com.dheerendra.service")
public class Boot_Project1_CoreDI_Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishGenerator ser=null;
		ctx=SpringApplication.run(Boot_Project1_CoreDI_Application.class, args);
		ser=ctx.getBean("wish",WishGenerator.class);
		System.out.println(ser.generateWishMessage("Dheerendra"));
	}
}
