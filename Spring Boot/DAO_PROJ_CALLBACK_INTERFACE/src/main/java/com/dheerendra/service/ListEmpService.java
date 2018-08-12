package com.dheerendra.service;

import java.util.List;

import com.dheerendra.dto.EmployeeDTO;

public interface ListEmpService {
	public EmployeeDTO findEmpDetailsByNo(int no);
	public List<EmployeeDTO> findempDetailsByDesg(String desg);

}
