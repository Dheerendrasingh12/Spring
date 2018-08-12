package com.dheerendra.dao;

import java.util.List;

import com.dheerendra.bo.TicketBO;

public interface RailwayDAO {
	public int[] insertGroupTickets(List<TicketBO> listBO);

}
