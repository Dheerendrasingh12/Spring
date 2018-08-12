package com.dheerendra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.dheerendra.bo.StudentBO;

public class StudentDAOImplement implements StudentDao{

	private static final String Student_Result_Registration="INSERT INTO LAYERED_STUDENT VALUES (?,?,?,?,?)";
	private DataSource ds;
	
	

	public StudentDAOImplement(DataSource ds) {

		this.ds = ds;
	}



	@Override
	public int insert(StudentBO bo) {
		try {
			int result=0;
			Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(Student_Result_Registration);
			ps.setInt(1, bo.getSno());
			ps.setString(2, bo.getSname());
			ps.setInt(3, bo.getTotal());
			ps.setFloat(4, bo.getAvg());
			ps.setString(5, bo.getResult());
			result=ps.executeUpdate();
			return result;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
		
	}

}
