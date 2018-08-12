package com.dheerendra.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dheerendra.bo.TicketBO;

public class RailwayDAOImpl implements RailwayDAO {

	private static final String INSERT_RAIL_TICKETS="INSERT INTO RAILWAY_TICKETS(PNR,PASS_NAME,SOURCE,DESTINATION) VALUES(?,?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public int[] insertGroupTickets(List<TicketBO> listBO) {
	
			int result[]=null;
			result=jt.batchUpdate(INSERT_RAIL_TICKETS,new BatchPreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps, int i) throws SQLException {
					System.out.println("setValues(-,-)");
					ps.setInt(1, listBO.get(i).getPnr());
					ps.setInt(2,listBO.get(2).getTrainNo());
					ps.setString(3, listBO.get(i).getPassName());
					ps.setString(4, listBO.get(i).getSource());
					ps.setString(5, listBO.get(i).getDest());
					
				}
				
				@Override
				public int getBatchSize() {
					System.out.println("getBatchSize()");
					return listBO.size();
				}
			});
			
			
		return null;
	}

}
