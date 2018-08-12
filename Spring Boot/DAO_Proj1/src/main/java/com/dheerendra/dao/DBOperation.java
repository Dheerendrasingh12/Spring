package com.dheerendra.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperation implements DBOpertationImp{

	private static final String GET_EMP_COUNT = "SELECT COUNT(*) FROM EMP";

	private static final String GET_EMP_SAL = "SELECT SAL FROM EMP WHERE EMPNO=?";

	private static final String GET_EMP_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";

	private static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";

	private static final String INSERT_EMP_DETAILS = "INSERT INTO EMP(EMPNO,ENAME,JOB) VALUES (?,?,?)";

	private static final String UPDATE_NEW_SALARY = "UPDATE EMP SET SAL=? WHERE EMPNO=?";


	private JdbcTemplate jt;
	
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int getEmpsCount() {
		System.out.println("Datasource class name "+jt.getDataSource().getClass());
		int count=0;
		
		count =jt.queryForObject(GET_EMP_COUNT, new Object[] {},Integer.class);
		
		return count;

	}

	public float getSalary(int empNo) {
		float sal=0.0f;
		sal=jt.queryForObject(GET_EMP_SAL, Float.class,empNo);
		return sal;
}

	public Map<String, Object> getEmpDetailsByNo(int empNo) {
		Map<String,Object> map=null;
		map=jt.queryForMap(GET_EMP_BY_NO,empNo);
		return map;
	}

	public List<Map<String, Object>> getEmpDetailsByDesg(String desg) {
		List< Map<String, Object>> list=null;
		list=jt.queryForList(GET_EMP_BY_DESG,desg);
		return list;
	
	}

	public int insertEmp(int empNo, String ename, String desg) {
		int count=0;
		count=jt.update(INSERT_EMP_DETAILS,empNo,ename,desg);
		
		return count;
	}

	public int updateNewSalaryByEmpNo(int empNo, float newSalary) {
		int count=0;
		count=jt.update(UPDATE_NEW_SALARY,newSalary,empNo);
		
		return count;
	}
	
}
