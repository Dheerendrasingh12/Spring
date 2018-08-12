package com.dheerendra.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dheerendra.service.Emp_Service;

public class Main_Servlet extends HttpServlet {

	ApplicationContext ctx = null;
	Emp_Service ser = null;

	public void init() {
		ctx = new ClassPathXmlApplicationContext("com/dheerendra/cfgs/applicationContext.xml");

		ser = ctx.getBean("service", Emp_Service.class);
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String jobs[]=req.getParameterValues("job");
		
		List<Map<String,Object>> list=ser.search(jobs);
		req.setAttribute("result", list);
		RequestDispatcher rd=req.getRequestDispatcher("/result.jsp");
		
		rd.forward(req, res);
	}
}
