package com.dheerendra.dao;


import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dheerendra.bo.StudentBO;

public class RegisterStudentDao {

	private static final String STUD_INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int[] insert(final List<StudentBO> listbo) {
		int result[]=jt.batchUpdate(STUD_INSERT_QUERY,new BatchInsertion(listbo));
		return result;
	}
	private static final class BatchInsertion implements BatchPreparedStatementSetter{
		private List<StudentBO> listbo;

		public BatchInsertion(List<StudentBO> listbo) {
			this.listbo = listbo;
		}

		public int getBatchSize() {
			System.out.println("getBatchSize()");
			
			return listbo.size();
		}

		public void setValues(PreparedStatement ps, int index) throws SQLException {
		
			System.out.println("setValues(-,-)");
			ps.setInt(1,listbo.get(index).getSno());
			ps.setString(2, listbo.get(index).getName());
			ps.setString(3, listbo.get(index).getAddress());
			
		}
		
		
	}
	
	
}
