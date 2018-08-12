package com.dheerendra.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MariageServlet extends HttpServlet {

	private Logger logger=Logger.getLogger(MariageServlet.class);
	@Override
	public void init() throws ServletException {
		String Log_File=null;
		System.out.println("init()");
		try {
			ServletContext sc=getServletContext();
			Log_File=sc.getRealPath("/")+"WEB-INF\\classes\\com\\dheerendra\\commons\\log4j.properties";
	PropertyConfigurator.configure(Log_File);
	logger.debug("MarriageServlet: init() log4j intialize  "+Log_File);
		}catch (Exception e) {
			logger.error("Marriage Servlet init() log4j failed to intialized  "+Log_File);
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	
			PrintWriter pw=null;
			String name=null,gender=null,tage=null;
			int age=0;
			
			List<String> errList;
			String vstatus=null;
			
			pw=res.getWriter();
			res.setContentType("text/html");
			logger.debug("General Setting are done");
			
			name=req.getParameter("pname");
			gender=req.getParameter("gender");
			tage=req.getParameter("page");
			
			logger.debug("form data is gathered");
			
			vstatus=req.getParameter("vflag");
			
			if(vstatus.equalsIgnoreCase("no")) {
				errList=new ArrayList<>();
				logger.debug("form validation are started");
				
				if(name==null || name.length()==0 || name.equalsIgnoreCase("")) {
					errList.add("<h4 style='color:red'>Person name is required</h4>");
				}
			}
	}
	
	
}
