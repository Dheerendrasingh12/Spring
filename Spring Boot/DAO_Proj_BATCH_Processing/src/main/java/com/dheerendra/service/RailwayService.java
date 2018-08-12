package com.dheerendra.service;

import java.util.List;

import com.dheerendra.dto.TicketDTO;

public interface RailwayService {

	public String performGroupTicketReservation(List<TicketDTO> listDTO);

}
