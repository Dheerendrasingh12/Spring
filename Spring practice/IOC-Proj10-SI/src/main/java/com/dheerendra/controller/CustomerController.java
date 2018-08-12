package com.dheerendra.controller;

import com.dheerendra.dto.CustomerDto;
import com.dheerendra.service.CustomerService;
import com.dheerendra.vo.CustomerVo;

public class CustomerController {

	private CustomerService service;

	public CustomerController(CustomerService service) {
		this.service = service;
	}
	
	public String process(String cno,String cname,String cPrincipal,String cRate,String cTime) {
		CustomerVo vo=new CustomerVo();
		vo.setCno(cno);
	
		vo.setCname(cname);
		vo.setCprin(cPrincipal);
		vo.setCrate(cRate);
		vo.setCtime(cTime);
		CustomerDto dto=null;
		String result=null;
		
		dto=new CustomerDto();
		
		dto.setCno(Integer.parseInt(vo.getCno()));
		dto.setCname(vo.getCname());
		dto.setCprin(Float.parseFloat(vo.getCprin()));
		dto.setCrate(Float.parseFloat(vo.getCrate()));
		dto.setCtime(Float.parseFloat(vo.getCtime()));
		
		result=service.calculateInterest(dto);
		return result;
	}
	

}
