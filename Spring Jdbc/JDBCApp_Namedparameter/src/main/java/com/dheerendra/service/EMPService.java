package com.dheerendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dheerendra.bo.EmployeeBO;
import com.dheerendra.dao.EmpDAO;
import com.dheerendra.dto.EmployeeDTO;

@Service(value="ser")
public class EMPService {
	private EmpDAO dao;

	@Autowired
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	public String searchNameByNO(int no) {
		String name=dao.findName(no);
		return name;
		
	}
	public EmployeeDTO searchEmp(int no) {
		EmployeeBO bo=dao.findEmp(no);
		
		EmployeeDTO dto=new EmployeeDTO(bo.getEno(), bo.getSalary(),bo.getEname(), bo.getJob());
		
		return dto;
	}
	public String registerEmp(int eno,String ename,String job,int salary) {
		EmployeeDTO dto=new EmployeeDTO(eno, salary, ename, job);
		EmployeeBO bo=new EmployeeBO(dto.getEno(), dto.getSalary(), dto.getEname(), dto.getJob());
		
		int result=dao.insertRecord(bo);
		if(result==1)
			return "Registration Success";
		else 
			return "Registration failed";
			
	}

}
