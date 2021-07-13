package com.revature.three_database.dao;

import org.hibernate.Session;

import com.revature.three_database.interfaces.LoginInterface;
import com.revature.three_database.models.UserRoles;
import com.revature.three_database.models.Users;
import com.revature.utils.HibernateUtil;

public class LoginDAO implements LoginInterface {

	@Override
	public Users retrieveCredentials(String username, String password) {
		
		Session session = HibernateUtil.getSession();

		Users user = (Users) session.createQuery("FROM Users WHERE ers_username = ?1 AND ers_password = ?2")
				.setParameter(1, username).setParameter(2, password).uniqueResult();
		
		HibernateUtil.closeSession();
		
		if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
			return user;
		}
		
		return null;
	}
	
	
	@Override
	public UserRoles retrieveRoles(Users user, Session roleSession) {
		UserRoles role = (UserRoles) roleSession.createQuery("FROM UserRoles WHERE ers_user_role_id = ?1").setParameter(1, user.getId()).uniqueResult();
		if(role != null) {
			return role;
		}
		return null;
	}

}
