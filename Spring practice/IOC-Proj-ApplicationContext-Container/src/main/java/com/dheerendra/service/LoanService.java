package com.dheerendra.service;

import com.dheerendra.bo.CustomerBO;
import com.dheerendra.dao.LoanDAO;

public class LoanService {
	private LoanDAO dao;
	
	public void setDao(LoanDAO dao) {
		this.dao = dao;
	}

	public float calculate(int cno,String cname,float pamt,float parate,float ptime) {
		float intamt=0;
		int result=0;
		intamt=(pamt*parate*ptime)/100;
		
		CustomerBO cbo=new CustomerBO();
		cbo.setCname(cname);
		cbo.setCno(cno);
		cbo.setIntamt(intamt);
		cbo.setPamt(pamt);
		result=dao.insert(cbo);
		
		
		return intamt;
		
	}


}
