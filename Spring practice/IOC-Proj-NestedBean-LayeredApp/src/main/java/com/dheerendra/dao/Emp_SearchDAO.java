package com.dheerendra.dao;

import java.util.List;

import com.dheerendra.bo.EmployeeBO;

public interface Emp_SearchDAO {
	
	public  List<EmployeeBO> findEmpsByDesg(String cond)throws Exception;

}
