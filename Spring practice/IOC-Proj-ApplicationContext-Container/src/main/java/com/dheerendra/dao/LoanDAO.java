package com.dheerendra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.dheerendra.bo.CustomerBO;

public class LoanDAO {
 private static String Insert_Query="INSERT INTO CUSTOMER_LOANINFO values(?,?,?,?)";
 private DataSource ds;
public void setDs(DataSource ds) {
	this.ds = ds;
}
public int insert(CustomerBO cbo) {
	Connection con=null;
	PreparedStatement ps=null;
	int rs=0;
	
	try {
		con=ds.getConnection();
		ps=con.prepareStatement(Insert_Query);
		ps.setInt(1, cbo.getCno());
		ps.setString(2, cbo.getCname());
		ps.setFloat(3, cbo.getPamt());
		ps.setFloat(4, cbo.getIntamt());
		rs=ps.executeUpdate();
	}catch (SQLException se) {
		se.printStackTrace();
		// TODO: handle exception
	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	finally {
		try {
			if(ps!=null)
				ps.close();
		}catch (SQLException se) {
			se.printStackTrace();
			// TODO: handle exception
		}try {
			if(con!=null)
				con.close();
		}catch (SQLException se) {
			se.printStackTrace();
			// TODO: handle exception
		}
	}
	return rs;
	
}
 
}
