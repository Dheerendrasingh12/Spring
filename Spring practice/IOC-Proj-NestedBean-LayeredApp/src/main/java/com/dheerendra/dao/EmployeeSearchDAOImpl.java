package com.dheerendra.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.dheerendra.bo.EmployeeBO;


public class EmployeeSearchDAOImpl implements Emp_SearchDAO {
	private DataSource ds;
	
	  public EmployeeSearchDAOImpl(DataSource ds) {
			this.ds = ds;
		}

	@Override
	public List<EmployeeBO> findEmpsByDesg(String cond) throws Exception {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		EmployeeBO bo=null;
		List<EmployeeBO> listBO=null;
		//get Pooled Jdbc connection
		con=ds.getConnection();
		//create STatement object
		st=con.createStatement();
		//send and execute SQL Query
		rs=st.executeQuery("SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN "+cond+" ORDER BY JOB");
		//Copy ResultSet obj recrods to ListCollection in the form  BO class objs
		listBO=new ArrayList();
		while(rs.next()){
			//Copy each record of ResultSet to BO class obj
		  bo=new EmployeeBO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
		  
		  
		 // System.out.println(rs.getInt(1));
		  bo.setEmpno(rs.getInt(1));
		  bo.setEname(rs.getString(2));
		  bo.setJob(rs.getString(3));
		  bo.setSal(rs.getInt(4));
		  bo.setDeptno(rs.getInt(5));
		  //Add Each BO class obj to ListCollection
		  listBO.add(bo);
		}//while
		return listBO;
	}//method
}//class
