package com.dheerendra.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import com.dheerendra.bo.EmployeeBO;
import com.dheerendra.dao.ListEmpDAO;
import com.dheerendra.dto.EmployeeDTO;

/**
 * Hello world!
 *
 */
public class ListEmpServiceImpl implements ListEmpService {

	private ListEmpDAO dao;

	public void setDao(ListEmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public EmployeeDTO findEmpDetailsByNo(int no) {

		EmployeeBO bo = null;
		bo = dao.getEmpDetailsByNo(no);

		EmployeeDTO dto = new EmployeeDTO();
		dto.setNo(bo.getNo());
		dto.setName(bo.getEname());
		dto.setJob(bo.getJob());
		dto.setSal(bo.getSal());

		return dto;
	}

	@Override
	public List<EmployeeDTO> findempDetailsByDesg(String desg) {
		List<EmployeeBO> listBO = null;
		List<EmployeeDTO> listDTO = new ArrayList();
		// use DAO
		listBO = dao.getEmpDetailsByDesg(desg);
		// Convert listBO to listDTO
		listBO.forEach(bo -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

}
