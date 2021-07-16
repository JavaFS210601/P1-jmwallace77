package com.revature.one_web.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.EmployeeDTO;
import com.revature.models.EmployeeSubmitDTO;
import com.revature.three_database.models.Reimbursement;
import com.revature.two_service.services.EmployeeService;

public class EmployeeController {
	
	private ObjectMapper objMapper = new ObjectMapper();
	private EmployeeService employeeService = new EmployeeService();
	
	public void submitRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
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
			EmployeeSubmitDTO empDTO = objMapper.readValue(sBody, EmployeeSubmitDTO.class);
			
			if(employeeService.submitRequest(empDTO)){
				res.setStatus(200);
			}
			else {
				res.setStatus(500);
			}
		}
	}

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
			EmployeeDTO empDTO = objMapper.readValue(sBody, EmployeeDTO.class);
			
			List<Reimbursement> reimb = employeeService.getPendingReimbursements(empDTO);
			

			
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
			EmployeeDTO empDTO = objMapper.readValue(sBody, EmployeeDTO.class);
			
			List<Reimbursement> reimb = employeeService.getPastReimbursements(empDTO);
			

			
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
