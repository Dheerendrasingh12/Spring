package com.dheerendra.service;

import java.util.List;

import com.dheerendra.dto.EmployeeDTO;

public interface EmpSearach_Service {
	public  List<EmployeeDTO> searchEmpsByDesg(String[] desgs)throws Exception;


	
}
