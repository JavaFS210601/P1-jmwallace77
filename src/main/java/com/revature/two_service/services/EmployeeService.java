package com.revature.two_service.services;

import com.revature.models.EmployeeSubmitDTO;
import com.revature.three_database.dao.EmployeeDAO;

public class EmployeeService {
	
	private EmployeeDAO empDAO = new EmployeeDAO();
	
	public boolean submitRequest(EmployeeSubmitDTO empDTO) {
		if(empDAO.submitReimbursementRequest(empDTO)) {
			return true;
		}
		return false;
	}

}
