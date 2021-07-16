package com.revature;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.models.ManagerAcceptDTO;
import com.revature.models.ManagerDTO;
import com.revature.models.ManagerRejectDTO;
import com.revature.three_database.dao.ManagerDAO;
import com.revature.three_database.models.Reimbursement;

public class ManagerTesting {
	// testing classes
		public static ManagerDAO mngDAO;
		
		//testing variables
		public boolean accepted;
		public boolean rejected;
		public List<Reimbursement> pendingList;
		public List<Reimbursement> pastList;
		public static ManagerAcceptDTO mngAccDTO;
		public static ManagerRejectDTO mngRejDTO;
		public static ManagerDTO mngDTO;
		
		@BeforeAll
		public static void initializeItemsBeingTested() {
			mngDAO = new ManagerDAO();
			mngAccDTO = new ManagerAcceptDTO();
			mngRejDTO = new ManagerRejectDTO();
			mngDTO = new ManagerDTO();
			mngAccDTO.setUserId("1");
			mngAccDTO.setStatus("accepted");
			mngAccDTO.setReimbId("8");
			mngRejDTO.setUserId("1");
			mngRejDTO.setStatus("rejected");
			mngRejDTO.setReimbId("5");
			mngDTO.setUserId("1");
		}
		
		@BeforeEach
		public void initializeTestingVariables() {
			
		}
		
		@Test
		public void pendingNotNull() {
			pendingList = ManagerDAO.getPendingReimbursements(mngDTO);
			assertNotNull("No pending reimbursements was found", pendingList);
		}
		
		@Test
		public void accept() {
			accepted = ManagerDAO.acceptReimbursement(mngAccDTO);
			assertTrue(accepted);
		}
		
		@Test
		public void reject() {
			rejected = ManagerDAO.rejectReimbursement(mngRejDTO);
			assertTrue(rejected);
		}
		
		@Test
		public void pastNotNull() {
			pastList = ManagerDAO.getPastReimbursements(mngDTO);
			assertNotNull("No past reimbursements was found", pastList);
		}
}
