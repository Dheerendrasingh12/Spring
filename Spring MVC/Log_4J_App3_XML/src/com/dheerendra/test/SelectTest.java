package com.dheerendra.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.DOMConfigurator;

public class SelectTest {
	private static final String Get_Student_Query="SELECT EMPNO,ENAME,JOB FROM EMP";
	private static  Logger logger=Logger.getLogger(SelectTest.class);
	static{
		DOMConfigurator.configure("src/com/dheerendra/commons/log4j.xml");
	}

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main(-) method");
		try{
			logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main().try block");
			//load jdbc dirver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.warn("Log4jJdbcProj1.mod1.SelectTest1.JDBC Driver Loaded (optional to load driver class)");
			//establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott","root");
			logger.info("Log4jJdbcProj1.mod1.SelectTest1.connection established ");
			//create STatement object
			if(con!=null){
				st=con.createStatement();
				logger.debug("Log4jJdbcProj1.mod1.SelectTest1.statement obj is created");
			}
			//send and and excute SQL Query 
			if(st!=null){
				rs=st.executeQuery(Get_Student_Query);
				logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main()::"+Get_Student_Query+" QUERY exected and ResultSEt object created");	 	
			}
			//prcess the ResultSEt object
			if(rs!=null){
				while(rs.next()){
					flag=true;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main().ResultSet obj is processed");
				
				if(flag==false){
					System.out.println("Record not found");
					logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main().ResultSet obj is empty");
				}
			}//if
			logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main().end of try block");
		}//try
		catch(SQLException se){
			logger.error("Log4jJdbcProj1.mod1.SelectTest1.main()"+se.getMessage());
		}
		catch(ClassNotFoundException cnf){
			logger.error("Log4jJdbcProj1.mod1.SelectTest1.main()"+cnf.getMessage());
		}
		catch(Exception e){
			logger.fatal("Log4jJdbcProj1.mod1.SelectTest1.main()->Unknown Problem"+e.getMessage());
		}
	  finally{
		  logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main()-->finally block");
		  //close jdbc objs
		  try{
			  if(rs!=null)
				  rs.close();
			  logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main().ResultSet obj is closed");
		  }
		  catch(SQLException se){
			  logger.error("Log4jJdbcProj1.mod1.SelectTest1.main()->Problem in closing ResultSet object");
		  }
		  
		  try{
			  if(st!=null)
				  st.close();
			  logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main().Statement obj is closed");
		  }
		  catch(SQLException se){
			  logger.error("Log4jJdbcProj1.mod1.SelectTest1.main()->Problem in closing Statement object");
		  }
		  
		  try{
			  if(con!=null)
				  con.close();
			  logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main().Connection obj is closed");
		  }
		  catch(SQLException se){
			  logger.error("Log4jJdbcProj1.mod1.SelectTest1.main()->Problem in closing Connection object");
		  }		  
		  logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main()-->end of finally block");
	  }//finally
		 logger.debug("Log4jJdbcProj1.mod1.SelectTest1.main()-->end of main(-)");
	}//main
	
}//class
