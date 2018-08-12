package com.dheerendra.service;

import java.util.List;
import java.util.Map;

import com.dheerendra.dao.Emp_DAO;

public class Emp_Service {

	private Emp_DAO dao;

	public void setDao(Emp_DAO dao) {
		this.dao = dao;
	}
	
	public List search(String job[]) {
		StringBuffer sb=new StringBuffer("(");
		for(int i=0;i<job.length;++i) {
			if(i==job.length-1) {
				sb.append("'"+job[i]+"'");
				
			}
			else {
				sb.append("'"+job[i]+"',");
			}
		}
		
			
			sb.append(")");
			String cond=sb.toString();
			
			List<Map<String ,Object>> list=null;
			list=dao.getEnoDetails(cond);
			return list;
			
		
	}
}
