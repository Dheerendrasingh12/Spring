package com.dheerendra.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.dheerendra.bo.EmployeeBO;
import com.nt.dao.EmployeeDAOImpl.EmployeeExtractor;

public class ListEmpDAOImpl implements ListEmpDAO {

	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	
	
	private JdbcTemplate jt;
	
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	
	@Override
	public EmployeeBO getEmpDetailsByNo(int no) {
		EmployeeBO bo=null;
		bo=jt.queryForObject(GET_EMP_BY_NO,new EmpRowMapper(),no);
		return bo;
	}
	@Override
	public List<EmployeeBO> getEmpDetailsByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		listBO=(List<EmployeeBO>) jt.query(GET_EMP_BY_DESG,new EmployeeExtractor(),desg);
		return listBO;
	}
	
	

	private class EmpRowMapper implements org.springframework.jdbc.core.RowMapper<EmployeeBO>{

		@Override
		public EmployeeBO mapRow(ResultSet rs, int pos) throws SQLException {
			System.out.println("map row(-,-)");
			EmployeeBO bo=null;
			bo=new EmployeeBO();
			bo.setNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getInt(4));
			
			
			return bo;
		}
		
		
		
	}
	private class EmployeeExtractor implements ResultSetExtractor<EmployeeBO>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				EmployeeBO bo=null;
				List<EmployeeBO> listBO=null;
				listBO=new ArrayList();
				while(rs.next()){
					bo=new EmployeeBO();
					bo.setEno(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setDesg(rs.getString(3));
					bo.setSalary(rs.getInt(4));
					listBO.add(bo);
				}
				return listBO;
		}
		
	}
}


