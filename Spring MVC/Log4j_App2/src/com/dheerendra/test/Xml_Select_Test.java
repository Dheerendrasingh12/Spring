package com.dheerendra.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.XMLLayout;

public class Xml_Select_Test {
	private static final String Get_Student_Query="SELECT EMPNO,ENAME,JOB FROM EMP";
	private static Logger logger=Logger.getLogger(Xml_Select_Test.class);
	static {
		Layout layout=null;
		Appender appender=null;
		try {
			layout=new XMLLayout();
			appender=new FileAppender(layout,"JDBClog.xml",true);
			logger.addAppender(appender);
			logger.setLevel(Level.DEBUG);
			logger.info("Log4jApp1.mod1.XML Select Test Static block log 4j initialized");
			
		}catch (IOException ioe) {
			logger.error("Log4jApp1.mod1.XML Select Test Static block log 4j initialized failed");
			
			// TODO: handle exception
		}catch (Exception e) {
			logger.fatal("Log4jApp1.mod1.XML Select Test Static block log 4j initialized fatal error");
			
			// TODO: handle exception
		}
	
	}
	public static void main(String[] args) {
		
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			boolean flag=false;
			logger.debug("Log4jApp1.mod1.XML Select Test main method");
			
			try {
				logger.debug("Log4jApp1.mod1.XML Select Test main method try");
				
			
			
			
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
	
			logger.warn("Log4jApp1.mod1.XML Select Driver is load but it is optional");
				
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","root");
				
				logger.debug("Log4jApp1.mod1.XML Select main connection estabilsh");
				if(con!=null) {
					st=con.createStatement();
					logger.debug("Log4jApp1.mod1.XML Select main connection create");
				}
					if(st!=null) {
						rs=st.executeQuery(Get_Student_Query);
						logger.debug("Log4jApp.mod1.HTMLselectTest.amin(-).ResultSet obj created "+Get_Student_Query);
					}
					if(rs!=null) {
						while(rs.next()) {
							flag=true;
							System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
							
						}
						logger.debug("Log4jApp1.mod1.XML Select main resultset obj is process");
					}
					if(flag==false) {
						System.out.println("DB table is empty");
						logger.debug("Log4jApp1.mod1.XML Select main result set is  not process ");
					}
				
				
			}catch (SQLException sql) {
				logger.error("Log4jApp1.mod1.XML Select main.DB problem "+sql.getErrorCode());
				// TODO: handle exception
				sql.printStackTrace();
			}catch (ClassNotFoundException cnf) {
				logger.error("Log4jApp1.mod1.XML Select main(-).Driverv problem "+cnf.getMessage());
				cnf.printStackTrace();
				// TODO: handle exception
			}catch (Exception e) {
				
				logger.fatal("Log4jApp1.mod1.XML Select main.Unknow problem "+e.getMessage());
				// TODO: handle exception
			}
			
			finally {
				logger.debug("Log4jApp1.mod1.XML Select main.finally block");
			
				try {
					if(rs!=null) {
						rs.close();
						logger.debug("Log4jApp1.mod1.XML Select main.finally block::ResultSetClosed");
					}
				}catch (SQLException sql) {
					sql.printStackTrace();
					logger.error("Log4jApp1.mod1.XML Select main.finally block::ResultSet not Closed");
					// TODO: handle exception
				}
				try {
				if(st!=null) {
					st.close();
					logger.debug("Log4jApp1.mod1.XML Select main.finally block::Statemente is Closed");
				}
						
				}catch (SQLException sql) {
					logger.error("Log4jApp1.mod1.XML Select main.finally block::Statement is not Closed");
					// TODO: handle exception
					sql.printStackTrace();
					
				}
				try {
					if(con!=null) {
						con.close();
						logger.debug("Log4jApp1.mod1.XML Select main.finally block::Connection is Closed");
					}
				}catch (SQLException se) {

					se.printStackTrace();
					logger.error("Log4jApp1.mod1.XML Select main.finally block: Connection is not Closed");
					
					// TODO: handle exception
				}
				
			}
			logger.info("Log4jApp1.mod1.XML Select main.Application Exited");
		}
	}


