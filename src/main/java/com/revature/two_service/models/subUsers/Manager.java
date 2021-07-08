package com.revature.two_service.models.subUsers;

import com.revature.two_service.models.User;

public class Manager extends User {

	public Manager(int ers_users_id, String ers_username, String ers_password, String user_first_name,
			String user_last_name, String user_email, int user_role_id) {
		super(ers_users_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [getErs_users_id()=" + getErs_users_id() + ", getErs_username()=" + getErs_username()
				+ ", getErs_password()=" + getErs_password() + ", getUser_first_name()=" + getUser_first_name()
				+ ", getUser_last_name()=" + getUser_last_name() + ", getUser_email()=" + getUser_email()
				+ ", getUser_role_id()=" + getUser_role_id() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
