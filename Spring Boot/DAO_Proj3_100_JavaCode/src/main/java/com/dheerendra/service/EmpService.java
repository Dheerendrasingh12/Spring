package com.dheerendra.service;

import java.util.List;
import java.util.Map;

public interface EmpService {

	public int fetchEmpCount();
	public float fetchEmpSalary(int empNo);
	public Map<String,Object> fetchDetails(int empNo );
	public List<Map<String,Object>> listEmpDetails(String desg);
	public String reg_empDetails(int empNo,String ename,String job);
	public String inc_Salary(int empNo,float percentage);
}
