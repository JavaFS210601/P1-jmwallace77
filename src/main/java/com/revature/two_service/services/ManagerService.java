package com.revature.two_service.services;

import java.util.List;

import com.revature.models.ManagerAcceptDTO;
import com.revature.models.ManagerDTO;
import com.revature.models.ManagerRejectDTO;
import com.revature.three_database.dao.ManagerDAO;
import com.revature.three_database.models.Reimbursement;

public class ManagerService {

	public List<Reimbursement>getPendingReimbursements(ManagerDTO mngDTO) {
		List<Reimbursement> reimb = ManagerDAO.getPendingReimbursements(mngDTO);
		
		if(reimb != null){
			return reimb;
		}
		return null;
	}

	public boolean acceptReimbursement(ManagerAcceptDTO mngAcceptDTO) {

		if(ManagerDAO.acceptReimbursement(mngAcceptDTO)){
			return true;
		}
		return false;
	}

	public boolean rejectReimbursement(ManagerRejectDTO mngRejectDTO) {
		if(ManagerDAO.rejectReimbursement(mngRejectDTO)){
			return true;
		}
		return false;
	}

	public List<Reimbursement> getPastReimbursements(ManagerDTO mngDTO) {
		List<Reimbursement> reimb = ManagerDAO.getPastReimbursements(mngDTO);
		
		if(reimb != null){
			return reimb;
		}
		return null;
	}

}
