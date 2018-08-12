package com.dheerendra.service;

import com.dheerendra.bo.StudentBO;
import com.dheerendra.dao.StudentDao;
import com.dheerendra.dto.StudentDTO;

public class StudentServiceImplementation implements StudentService{
	private StudentDao dao;
	

	public StudentServiceImplementation(StudentDao dao) {
		super();
		this.dao = dao;
	}


	@Override
	public String generateResult(StudentDTO dto) {
		
		int total=0;
		int count=0;
		float avg=0.0f;
		String result=null;
		total =dto.getM1()+dto.getM2()+dto.getM3();
		
		avg=total/3;
		
		if(avg<35)
			result="fail";
		else
			result="pass";
		StudentBO bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		count=dao.insert(bo);
		
		if(count==0)
			return "Result :"+bo.getResult()+" "+bo.getSno()+" "+bo.getSname()+"Registration failed";
		
		else

			return "Result :"+bo.getResult()+" "+bo.getSno()+" "+bo.getSname()+"Registration Succeded";
		
		
	}
}
