package com.revature.three_database.interfaces;

import org.hibernate.Session;

import com.revature.three_database.models.UserRoles;
import com.revature.three_database.models.Users;

public interface LoginInterface {
	public Users retrieveCredentials(String username, String password);
	public UserRoles retrieveRoles(Users user, Session roleSession);
}
