package com.dheerendra.dao;

import java.util.List;

import com.dheerendra.bo.EmployeeBO;

public interface ListEmpDAO
{
	public EmployeeBO getEmpDetailsByNo(int no);
	public List<EmployeeBO> getEmpDetailsByDesg(String desg);
	
	
}
