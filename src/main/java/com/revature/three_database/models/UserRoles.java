package com.revature.three_database.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ers_user_roles")
public class UserRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ers_user_role_id")
	private int id;
	
	@Column(name = "user_role", nullable = false)
	private String role;

	@OneToMany(mappedBy="roleId", fetch=FetchType.EAGER)
	private List<Users> usersList;

	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRoles(int id, String role, List<Users> usersList) {
		super();
		this.id = id;
		this.role = role;
		this.usersList = usersList;
	}

	public UserRoles(String role, List<Users> usersList) {
		super();
		this.role = role;
		this.usersList = usersList;
	}

	@Override
	public String toString() {
		return "UserRoles [id=" + id + ", role=" + role + ", usersList=" + usersList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((usersList == null) ? 0 : usersList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRoles other = (UserRoles) obj;
		if (id != other.id)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (usersList == null) {
			if (other.usersList != null)
				return false;
		} else if (!usersList.equals(other.usersList))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Users> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}
	
	
	
}
