package com.dheerendra.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class HTMLSelectTest {

	private static final String Get_Student_Query="SELECT EMPNO,ENAME,JOB FROM EMP";
	
	private static Logger logger=Logger.getLogger(com.dheerendra.test.HTMLSelectTest.class);

	public static void main(String[] args) {
		HTMLLayout layout=null;
		FileAppender appender=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		try {
			layout=new HTMLLayout();
			appender=new FileAppender(layout,"jdbcLog.html",true);
			
			logger.addAppender(appender);
			logger.setLevel(Level.ALL);
			logger.info("Log4jApp1.mod1.Html Select Test main(-).Application Startemet");
			
		
		
		
		
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.debug("Log4jApp.mod1.HTMLselectTest.main(-).jdbc driver register");
		
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","root");
			
			logger.debug("Log4jApp.mod1.HtmlselectTest.amin(-).connection estabilished");
			
			if(con!=null) {
				st=con.createStatement();
				logger.warn("Log4jApp.mod1.HTMLselectTest.amin(-).Statement create (Simple statement uded byt perfer using preparedStatement)");
			}
				if(st!=null) {
					rs=st.executeQuery(Get_Student_Query);
					logger.debug("Log4jApp.mod1.HTMLselectTest.amin(-).ResultSet obj created ");
				}
				if(rs!=null) {
					while(rs.next()) {
						flag=true;
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
						
					}
					logger.debug("Log4jApp.mod1.HTML xselectTest.amin(-).ResultSet obj is processed");
					
				}
				if(flag==false) {
					System.out.println("DB table is empty");
					logger.info("Log4jApp.mod1.selectTest.amin(-).DB table empty "+new Date());
					
				}
			
			
		}catch (SQLException sql) {
			logger.error("Log4jApp.mod1.selectTest.amin(-).DB problem "+sql.getErrorCode());
			// TODO: handle exception
			sql.printStackTrace();
		}catch (ClassNotFoundException cnf) {
			logger.error("Log4jApp.mod1.selectTest.amin(-).Driverv problem "+cnf.getMessage());
			cnf.printStackTrace();
			// TODO: handle exception
		}catch (Exception e) {
			
			logger.fatal("Log4jApp.mod1.selectTest.amin(-).Unknow problem "+e.getMessage());
			// TODO: handle exception
		}
		
		finally {
			logger.debug("Log4jApp.mod1.selectTest.amin(-).finally block");
		
			try {
				if(rs!=null) {
					rs.close();
					logger.debug("Log4jApp.mod1.selectTest.amin(-).finally block::ResultSetClosed");
				}
			}catch (SQLException sql) {
				sql.printStackTrace();
				logger.error("Log4jApp.mod1.selectTest.amin(-).finally block::ResultSet not Closed");
				// TODO: handle exception
			}
			try {
			if(st!=null) {
				st.close();
				logger.debug("Log4jApp.mod1.selectTest.amin(-).finally block::Statemente is Closed");
			}
					
			}catch (SQLException sql) {
				logger.error("Log4jApp.mod1.selectTest.amin(-).finally block::Statement is not Closed");
				// TODO: handle exception
				sql.printStackTrace();
				
			}
			try {
				if(con!=null) {
					con.close();
					logger.debug("Log4jApp.mod1.selectTest.amin(-).finally block::Connection is Closed");
				}
			}catch (SQLException se) {

				se.printStackTrace();
				logger.error("Log4jApp.mod1.selectTest.amin(-).finally block: Connection is not Closed");
				
				// TODO: handle exception
			}
			
		}
		logger.info("Log4jApp.mod1.selectTest.amin(-).Application Exited");
	}
}
