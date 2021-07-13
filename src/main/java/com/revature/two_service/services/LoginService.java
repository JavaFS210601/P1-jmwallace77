package com.revature.two_service.services;

import org.hibernate.Session;

import com.revature.three_database.dao.LoginDAO;
import com.revature.three_database.models.UserRoles;
import com.revature.three_database.models.Users;

public class LoginService {
	
	//DAO's used by the service
	private LoginDAO loginDAO = new LoginDAO();
	
	public Users login(String username, String password) {
		Users user = loginDAO.retrieveCredentials(username, password);
		if(user != null) {
			return user;
		}
		
		return null;
	}

	public UserRoles getRole(Users user, Session roleSession) {
		UserRoles role = loginDAO.retrieveRoles(user, roleSession);
		if(role != null) {
			return role;
		}
		return null;
	}

}
