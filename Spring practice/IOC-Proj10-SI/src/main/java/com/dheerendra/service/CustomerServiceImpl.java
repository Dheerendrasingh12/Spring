package com.dheerendra.service;

import com.dheerendra.bo.CustomerBo;
import com.dheerendra.dao.CustomerDao;
import com.dheerendra.dto.CustomerDto;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao dao;
	

	public CustomerServiceImpl(CustomerDao dao) {
		this.dao = dao;
	}


	public String calculateInterest(CustomerDto dto) {
		float si=0;
		int count=0;
		si=(dto.getCprin()*dto.getCrate()*dto.getCtime())/100;
		
		CustomerBo bo=new CustomerBo();
		bo.setCno(dto.getCno());
		bo.setCname(dto.getCname());
		bo.setCprin(dto.getCprin());
		bo.setCrate(dto.getCrate());
		bo.setCtime(dto.getCtime());
		bo.setCsi(si);
		count=dao.insert(bo);
		if(count==0)

			return "Insert to DB failed"+bo.getCname()+" Simple interest for "+bo.getCtime()+" year is"+bo.getCsi();
		else
		return "Successfully insert into DB "+bo.getCname()+" Simple interest for "+bo.getCtime()+" year is "+bo.getCsi();
}



}
