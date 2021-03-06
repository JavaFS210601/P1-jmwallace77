package com.revature.one_web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.one_web.controllers.EmployeeController;
import com.revature.one_web.controllers.LoginController;
import com.revature.one_web.controllers.ManagerController;

public class MasterServlet extends HttpServlet {
	
	//my controllers
	private LoginController loginC = new LoginController();
	private EmployeeController employeeC = new EmployeeController();
	private ManagerController managerC = new ManagerController();
	
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
			case "employeeSubmitRequest":
				employeeC.submitRequest(req, res);
				break;
			case "managerAcceptReimbursement":
				managerC.acceptRequest(req, res);
				break;
			case "managerRejectReimbursement":
				managerC.rejectRequest(req, res);
				break;
			case "managerGetPending":
				managerC.getPendingReimbursements(req, res);
				break;
			case "managerGetPast":
				managerC.getPastReimbursements(req,res);
				break;
			case "employeeGetPending":
				employeeC.getPendingReimbursements(req, res);
				break;
			case "employeeGetPast":
				employeeC.getPastReimbursements(req, res);
				break;
		}
	}
}
