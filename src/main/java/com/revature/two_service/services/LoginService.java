package com.revature.two_service.services;

public class LoginService {

	public boolean login(String username, String password) {
		
		if(username.equals("username") && password.equals("password")) {
			return true;
		}
		
		return false;
	}

}
