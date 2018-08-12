
package com.dheerendra.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.dheerendra.bo.TicketBO;
import com.dheerendra.dao.RailwayDAO;
import com.dheerendra.dto.TicketDTO;
@Service("railService")
public class RailwayServiceImpl implements RailwayService
{
	@Autowired
	private RailwayDAO dao;

	@Override
	public String performGroupTicketReservation(List<TicketDTO> listDTO) {
		List<TicketBO> listbo=new ArrayList();
		int result[]=null;
		listDTO.forEach(dto->{
			TicketBO bo=new TicketBO();
			BeanUtils.copyProperties(dto, bo);
			listbo.add(bo);
			
		});
		
		result=dao.insertGroupTickets(listbo);
		if(result!=null)
			return "Group Reservation is done";
		else
		return "Group Reservation is not done";
	}
	
}
