package com.dheerendra.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.dheerendra.dto.EmployeeDTO;
import com.dheerendra.service.EmpSearach_Service;
import com.dheerendra.vo.EmployeeVo;

public class EmpSearch_Controller {
	private EmpSearach_Service service;

	public EmpSearch_Controller(EmpSearach_Service service) {
		
		this.service = service;
	//	System.out.println("service.name"+((EmpSearach_Service)service).getName());
		
	}
	public List<EmployeeVo> getEmpByDegs(String degs[])throws Exception{
		
		List<EmployeeDTO> listDTO=null;
		List<EmployeeVo> listVO=new ArrayList<EmployeeVo>();
		listDTO=service.searchEmpsByDesg(degs);
		listDTO.forEach(dto->{
			EmployeeVo vo=new EmployeeVo();
			//vo.setSno(String.valueOf(dto.getSno()));
			vo.setEno(String.valueOf(dto.getEno()));
			
			vo.setEname(dto.getName());
			vo.setJob(dto.getJob());
			vo.setDeptno(String.valueOf(dto.getDeptno()));
			vo.setSalary(String.valueOf(dto.getSalary()));
			listVO.add(vo);
			
			
		});
		return listVO;
		
		
	
		
	}
	
}
