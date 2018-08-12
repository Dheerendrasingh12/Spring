package com.dheerendra.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.dheerendra.bo.EmployeeBO;
import com.dheerendra.dao.Emp_SearchDAO;
import com.dheerendra.dto.EmployeeDTO;

public class EmpSearch_ServiceImpl implements EmpSearach_Service {

	private Emp_SearchDAO dao;
	private String name;

	public EmpSearch_ServiceImpl(Emp_SearchDAO dao, String name) {
		this.dao = dao;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public List<EmployeeDTO> searchEmpsByDesg(String[] desgs) throws Exception {
		String cond="(";
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
		
		int length=0;
		for(int i=0;i<desgs.length;i++) {
			if(i==desgs.length-1)
				cond=cond+"'"+desgs[i]+"')";
			else
				cond=cond+"'"+desgs[i]+"',";
		}
		listBO=dao.findEmpsByDesg(cond);
		for(EmployeeBO bo:listBO) {
			EmployeeDTO dto=new EmployeeDTO();
			
			BeanUtils.copyProperties(bo,dto);
			dto.setSno(listDTO.size()+1);
			listDTO.add(dto);
			
		}
		
		
		
		return listDTO;
	}
}
