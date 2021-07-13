package com.revature.one_web.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.EmployeeSubmitDTO;
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
}
