package com.revature.one_web.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.LoginDTO;
import com.revature.three_database.models.UserRoles;
import com.revature.three_database.models.Users;
import com.revature.two_service.services.LoginService;
import com.revature.utils.HibernateUtil;

public class LoginController {
	//my object mapper and service provider
	private ObjectMapper objMapper = new ObjectMapper();
	private LoginService loginService = new LoginService();
	
	//method first reads JSON to a string 
	//then proceeds to convert JSON to java String
	//placing this parse string into my login Data Transfer Object
	public void login(HttpServletRequest req, HttpServletResponse res) throws IOException {
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
			LoginDTO lgDTO = objMapper.readValue(sBody, LoginDTO.class);
			
			Users user = loginService.login(lgDTO.getUsername(), lgDTO.getPassword());
			
			if(user != null) {
				
				Session roleSession = HibernateUtil.getSession();
				
				UserRoles role = loginService.getRole(user, roleSession);
				HibernateUtil.closeSession();
				
				
				HttpSession loginSession = req.getSession();
				
				loginSession.setAttribute("user", lgDTO);
				loginSession.setAttribute("valid", true);
				loginSession.setAttribute("userType", role.getRole());
				String json = objMapper.writeValueAsString(role.getRole() + "," + user.getId());
				
				res.setStatus(200);
				res.getWriter().print(json);
			}
			else {
				HttpSession loginSession = req.getSession(false);
				if(loginSession != null) {
					loginSession.invalidate();
				}
				res.setStatus(401);
				res.getWriter().print("Invalid Attempt to login");
			}
		}
	}

}
