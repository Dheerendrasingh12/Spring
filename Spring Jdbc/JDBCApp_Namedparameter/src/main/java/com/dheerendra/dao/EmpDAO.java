package com.dheerendra.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dheerendra.bo.EmployeeBO;


@Repository("dao")
public class EmpDAO {

	private static final String GET_EMP_NAME="SELECT ENAME FROM EMP WHERE EMPNO=:eno";

	private static final String GET_EMP_BYNO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=:eno";

	private static final String INSERT_EMP="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(:eno,:ename,:job,:sal)";
	@Autowired
	private NamedParameterJdbcTemplate njt;
	public void setNjt(NamedParameterJdbcTemplate njt) {
		this.njt = njt;
	}
	
	public String findName(int no) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("eno", no);
		String name=njt.queryForObject(GET_EMP_NAME, map, String.class);
		return name;
		
		
	}
	public EmployeeBO findEmp(int no) {
		MapSqlParameterSource mapSqlParameterSource=new MapSqlParameterSource();
		mapSqlParameterSource.addValue("eno", no);
		
		EmployeeBO bo=njt.queryForObject(GET_EMP_BYNO, mapSqlParameterSource, new EmpRowMapper());
		return bo;
	}
	private class EmpRowMapper implements org.springframework.jdbc.core.RowMapper<EmployeeBO>{

		public EmployeeBO mapRow(ResultSet rs, int pos) throws SQLException {
			// TODO Auto-generated method stub
			EmployeeBO bo=new EmployeeBO(rs.getInt(1),rs.getInt(4),rs.getString(2),rs.getString(3));
			return bo;
		}
		
	}
	public int insertRecord(EmployeeBO bo) {
		BeanPropertySqlParameterSource beanPropertySqlParameterSource=new BeanPropertySqlParameterSource(bo);
		int result=njt.update(INSERT_EMP, beanPropertySqlParameterSource);
		return result;
	}
}
