package com.revature;

import static org.junit.Assert.assertNotNull;

import org.hibernate.Session;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.three_database.dao.LoginDAO;
import com.revature.three_database.models.UserRoles;
import com.revature.three_database.models.Users;
import com.revature.utils.HibernateUtil;

public class LoginTesting {
	
	// testing classes
	public static LoginDAO lgDAO;
	
	//testing variables
	public Users user;
	public UserRoles role;
	public String username;
	public String password;
	public Session session;
	
	@BeforeAll
	public static void initializeClassesBeingTested() {
		lgDAO = new LoginDAO();
	}
	
	
	
	
	@Test
	public void userNotNull() {
		user = lgDAO.retrieveCredentials(username, password);
		assertNotNull("No user was found.", user);
	}
	
	@Test
	public void userRoleNotNull() {
		user = lgDAO.retrieveCredentials(username, password);
		session = HibernateUtil.getSession();
		role = lgDAO.retrieveRoles(user, session);
		assertNotNull("No role was found", role);
	}
}
