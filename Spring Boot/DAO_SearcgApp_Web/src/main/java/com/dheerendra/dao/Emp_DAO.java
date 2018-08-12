package com.dheerendra.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class Emp_DAO {
	private static final String Get_Emp_Details_By_Desg="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE=?";
	private JdbcTemplate jt;
	public void setJT(JdbcTemplate jt) {
		this.jt=jt;
		
	}
	
	public List getEnoDetails(String condition) {
		List<Map<String,Object>> list=jt.queryForList(Get_Emp_Details_By_Desg);
		return list;
	}

}
