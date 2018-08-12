package com.dheerendra.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationDao implements DBOperation {

	private static final String INSERT_QRY = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) values(?,?,?,?)";

	private static final String GET_EMP_SALARY = "SELECT SAL FROM EMP WHERE EMPNO=?";

	private static final String GET_EMP_DETAILS_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";

	private static final String GET_ALL_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP";

	private static final String UPDATE_EMP_SALARY = "UPDATE EMP SET SAL=? WHERE EMPNO=?";

	private static final String DELETE_EMP = "DELETE FROM EMP WHERE EMPNO=?";

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(int no, String name, String job, long sal) {
		int result = jt.update(INSERT_QRY, no, name, job, sal);

		return result;
	}

	public int getSalary(int no) {

		int salary=jt.queryforin
		
		return 0;
	}

	public Map<String, Object> listEmpDetatils(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> listAllEmpDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public int UpdateEmpSalary(int no, int newsal) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteEmp(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

}
