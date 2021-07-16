package com.revature;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.models.EmployeeDTO;
import com.revature.models.EmployeeSubmitDTO;
import com.revature.three_database.dao.EmployeeDAO;
import com.revature.three_database.models.Reimbursement;


public class EmployeeTesting {
	// testing classes
	public static EmployeeDAO empDAO;
	
	//testing variables
	public boolean submitted;
	public List<Reimbursement> pendingList;
	public List<Reimbursement> pastList;
	public static EmployeeSubmitDTO empSubDTO;
	public static EmployeeDTO empDTO;
	
	@BeforeAll
	public static void initializeItemsBeingTested() {
		empDAO = new EmployeeDAO();
		empSubDTO = new EmployeeSubmitDTO();
		empDTO = new EmployeeDTO();
		empSubDTO.setUserId("2");
		empSubDTO.setReimbType("2");
		empSubDTO.setAmount("250");
		empDTO.setUserId("2");
	}
	
	@BeforeEach
	public void initializeTestingVariables() {
		
	}
	
	@Test
	public void submitSucceded() {
		submitted = empDAO.submitReimbursementRequest(empSubDTO);
		assertTrue(submitted);
	}
	
	@Test
	public void pendingNotNull() {
		pendingList = EmployeeDAO.getPendingReimbursements(empDTO);
		assertNotNull("No pending reimbursements was found", pendingList);
	}
	
	@Test
	public void pastNotNull() {
		pastList = EmployeeDAO.getPastReimbursements(empDTO);
		assertNotNull("No past reimbursements was found", pastList);
	}
}
