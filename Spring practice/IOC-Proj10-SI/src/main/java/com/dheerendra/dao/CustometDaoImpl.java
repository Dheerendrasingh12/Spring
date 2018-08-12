package com.dheerendra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.dheerendra.bo.CustomerBo;

public class CustometDaoImpl implements CustomerDao{
	private static final String CUSTOMER_SI_INSERT="INSERT INTO CUSTOMER_SI VALUES(?,?,?,?,?,?)";
	private DataSource ds;
	
	public CustometDaoImpl(DataSource ds) {
		this.ds = ds;
	}

	public int insert(CustomerBo bo) {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(CUSTOMER_SI_INSERT);
			
			ps.setInt(1, bo.getCno());
			ps.setString(2, bo.getCname());
			ps.setFloat(3, bo.getCprin());
			ps.setFloat(4, bo.getCrate());
			ps.setFloat(5, bo.getCtime());
			ps.setFloat(6, bo.getCsi());
			
			result =ps.executeUpdate();
			
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
		
}


}
