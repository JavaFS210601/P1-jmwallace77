package com.revature.one_web.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.ManagerAcceptDTO;
import com.revature.models.ManagerDTO;
import com.revature.models.ManagerRejectDTO;
import com.revature.three_database.models.Reimbursement;
import com.revature.two_service.services.ManagerService;


public class ManagerController {
	
	private ObjectMapper objMapper = new ObjectMapper();
	private ManagerService managerService = new ManagerService();

	public void getPendingReimbursements(HttpServletRequest req, HttpServletResponse res) throws IOException {
		if(req.getMethod().equals("POST")) {
			//reads the request JSON string into a buffered reader
			//in order to build a JAVA string out of JSON 
			BufferedReader buffReader = req.getReader();
			StringBuilder sBuilder = new StringBuilder();
			String sLine = buffReader.readLine();
			
			//building the JAVA string line by line until null
			while(sLine != null) {
				sBuilder.append(sLine);
				sLine = buffReader.readLine();
			}
			
			//passing the built JAVA string into a new string
			String sBody = new String(sBuilder);
			objMapper.findAndRegisterModules();
			//mapping the JAVA string to the loginDTO object
			ManagerDTO mngDTO = objMapper.readValue(sBody, ManagerDTO.class);
			
			List<Reimbursement> reimb = managerService.getPendingReimbursements(mngDTO);
			

			
			if(reimb != null){
				//HttpSession getPendingReimbSession = req.getSession();
				String json = objMapper.writeValueAsString(reimb);
				
				
				res.getWriter().print(json);
				res.setStatus(200);
			}
			else {
				res.setStatus(500);
			}
		}
	}

	public void acceptRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
		if(req.getMethod().equals("POST")) {
			//reads the request JSON string into a buffered reader
			//in order to build a JAVA string out of JSON 
			BufferedReader buffReader = req.getReader();
			StringBuilder sBuilder = new StringBuilder();
			String sLine = buffReader.readLine();
			
			//building the JAVA string line by line until null
			while(sLine != null) {
				sBuilder.append(sLine);
				sLine = buffReader.readLine();
			}
			
			//passing the built JAVA string into a new string
			String sBody = new String(sBuilder);
			//mapping the JAVA string to the loginDTO object
			ManagerAcceptDTO mngAcceptDTO = objMapper.readValue(sBody, ManagerAcceptDTO.class);
			
			System.out.println("reimbId: " + mngAcceptDTO.getReimbId());
			
			if(managerService.acceptReimbursement(mngAcceptDTO)){
				res.setStatus(200);
			}
			else {
				res.setStatus(500);
			}
		}
		
	}

	public void rejectRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
		if(req.getMethod().equals("POST")) {
			//reads the request JSON string into a buffered reader
			//in order to build a JAVA string out of JSON 
			BufferedReader buffReader = req.getReader();
			StringBuilder sBuilder = new StringBuilder();
			String sLine = buffReader.readLine();
			
			//building the JAVA string line by line until null
			while(sLine != null) {
				sBuilder.append(sLine);
				sLine = buffReader.readLine();
			}
			
			//passing the built JAVA string into a new string
			String sBody = new String(sBuilder);
			//mapping the JAVA string to the loginDTO object
			ManagerRejectDTO mngRejectDTO = objMapper.readValue(sBody, ManagerRejectDTO.class);
			
			System.out.println("reimbId: " + mngRejectDTO.getReimbId());
			
			if(managerService.rejectReimbursement(mngRejectDTO)){
				res.setStatus(200);
			}
			else {
				res.setStatus(500);
			}
		}
	}

	public void getPastReimbursements(HttpServletRequest req, HttpServletResponse res) throws IOException {
		if(req.getMethod().equals("POST")) {
			//reads the request JSON string into a buffered reader
			//in order to build a JAVA string out of JSON 
			BufferedReader buffReader = req.getReader();
			StringBuilder sBuilder = new StringBuilder();
			String sLine = buffReader.readLine();
			
			//building the JAVA string line by line until null
			while(sLine != null) {
				sBuilder.append(sLine);
				sLine = buffReader.readLine();
			}
			
			//passing the built JAVA string into a new string
			String sBody = new String(sBuilder);
			objMapper.findAndRegisterModules();
			//mapping the JAVA string to the loginDTO object
			ManagerDTO mngDTO = objMapper.readValue(sBody, ManagerDTO.class);
			
			List<Reimbursement> reimb = managerService.getPastReimbursements(mngDTO);
			

			
			if(reimb != null){
				//HttpSession getPendingReimbSession = req.getSession();
				String json = objMapper.writeValueAsString(reimb);
				
				
				res.getWriter().print(json);
				res.setStatus(200);
			}
			else {
				res.setStatus(500);
			}
		}
	}

}
