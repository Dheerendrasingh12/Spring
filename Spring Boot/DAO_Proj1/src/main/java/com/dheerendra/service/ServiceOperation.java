package com.dheerendra.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dheerendra.dao.DBOperation;

@Service("empService")
public class ServiceOperation implements EmpService {


	private DBOperation dao;

	public void setDao(DBOperation dao) {
		this.dao = dao;
	}

	public int fetchEmpCount() {

		return dao.getEmpsCount();
	}

	public float fetchEmpSalary(int empNo) {
		return dao.getSalary(empNo);

	}

	public Map<String, Object> fetchDetails(int empNo) {
		// TODO Auto-generated method stub
		return dao.getEmpDetailsByNo(empNo);
	}

	public List<Map<String, Object>> listEmpDetails(String desg) {
		// TODO Auto-generated method stub
		return dao.getEmpDetailsByDesg(desg);
	}

	public String reg_empDetails(int empNo, String ename, String job) {
		int count = 0;

		count = dao.insertEmp(empNo, ename, job);
		if (count == 0)
			return "Emp Registation Failed";
		else
			return "Emp Registration Succeeded with employee Number " + empNo;
	}

	public String inc_Salary(int empNo, float percentage) {

		float currentSal = 0f, newSal = 0f;
		int count = 0;

		currentSal = fetchEmpSalary(empNo);
		newSal = currentSal + currentSal * (percentage / 100f);

		count = dao.updateNewSalaryByEmpNo(empNo, newSal);
		if (count == 0)
			return "Salary not increased for emp whose id " + empNo;
		// TODO Auto-generated method stub
		else
			return "Salary hiked for emp whose empNo is " + empNo;
	}

}
