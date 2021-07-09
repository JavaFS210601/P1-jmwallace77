package com.revature.one_web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.one_web.controllers.LoginController;

public class MasterServlet extends HttpServlet {
	
	//my controllers
	private LoginController loginC = new LoginController();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		servletSwitch(req, res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		servletSwitch(req, res);
	}
	
	private void servletSwitch(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("application/json");
		
		res.setStatus(404);
		
		String URI = req.getRequestURI().replace("/P1-jmwallace77/", "");
		
		switch(URI) {
			case "login":
				loginC.login(req, res);
				break;
			case "employee":
				break;
			case "manager":
				break;
		}
	}
}
