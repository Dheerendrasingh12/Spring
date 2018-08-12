package com.dheerendra.service;

import java.util.ArrayList;
import java.util.List;

import com.dheerendra.bo.StudentBO;
import com.dheerendra.dao.RegisterStudentDao;
import com.dheerendra.dto.StudentDTO;

public class RegisterStudentService {
	private RegisterStudentDao dao;

	public void setDao(RegisterStudentDao dao) {
		this.dao = dao;
	}
	
	public String registerStudent(List<StudentDTO> listdto) {
		List<StudentBO> listbo=new ArrayList<StudentBO>();
		for(StudentDTO dto:listdto) {
			StudentBO bo=new StudentBO(dto.getSno(), dto.getName(), dto.getAddress());
			listbo.add(bo);
		
		}
		int result[]=dao.insert(listbo);
		if(result!=null) {
			return "Batch insertion Sucess";
		}
		else {
			return "Batch insertion failed";
			
		}
	}

}
