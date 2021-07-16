package com.revature.two_service.services;

import java.util.List;

import com.revature.models.EmployeeDTO;
import com.revature.models.EmployeeSubmitDTO;
import com.revature.three_database.dao.EmployeeDAO;
import com.revature.three_database.dao.ManagerDAO;
import com.revature.three_database.models.Reimbursement;

public class EmployeeService {
	
	private EmployeeDAO empDAO = new EmployeeDAO();
	
	public boolean submitRequest(EmployeeSubmitDTO empDTO) {
		if(empDAO.submitReimbursementRequest(empDTO)) {
			return true;
		}
		return false;
	}

	public List<Reimbursement> getPendingReimbursements(EmployeeDTO empDTO) {
		List<Reimbursement> reimb = EmployeeDAO.getPendingReimbursements(empDTO);
		
		if(reimb != null){
			return reimb;
		}
		return null;
	}

	public List<Reimbursement> getPastReimbursements(EmployeeDTO empDTO) {
		List<Reimbursement> reimb = EmployeeDAO.getPastReimbursements(empDTO);
		
		if(reimb != null){
			return reimb;
		}
		return null;
	}

}
