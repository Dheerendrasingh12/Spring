package com.dheerendra.test;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dheerendra.dto.StudentDTO;
import com.dheerendra.service.RegisterStudentService;

public class ClientApp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		ApplicationContext ctx = null;

		ctx = new FileSystemXmlApplicationContext("src/main/java/com/dheerendra/cfgs/applicationContext.xml");

		RegisterStudentService service = null;
		service = ctx.getBean("stService", RegisterStudentService.class);

		StudentDTO st = new StudentDTO(12, "Dheerendra", "Hyderabad");
		StudentDTO st1 = new StudentDTO(3, "K", "Indore");

		java.util.List<StudentDTO> student = new ArrayList<StudentDTO>();

		student.add(st);
		student.add(st1);
		String result = null;
		result = service.registerStudent(student);
		System.out.println(result);
	}
}
