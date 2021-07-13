package com.revature.three_database.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ers_users")
public class Users implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ers_users_id")
	private int id;
	
	@Column(name = "ers_username", unique = true, nullable = false)
	private String username;
	
	@Column(name = "ers_password", nullable = false)
	private String password;
	
	@Column(name = "user_first_name", nullable = false)
	private String firstName;
	
	@Column(name = "user_last_name", nullable = false)
	private String lastName;
	
	@Column(name = "user_email", unique = true, nullable = false)
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ers_user_role_id")
	private UserRoles roleId;
	
	@OneToMany(mappedBy="author", fetch=FetchType.EAGER)
	private List<Reimbursement> reimbSubmittedList;

	@OneToMany(mappedBy="resolver", fetch=FetchType.EAGER)
	private List<Reimbursement> reimbResolvedList;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String username, String password, String firstName, String lastName, String email,
			UserRoles roleId, List<Reimbursement> reimbSubmittedList, List<Reimbursement> reimbResolvedList) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roleId = roleId;
		this.reimbSubmittedList = reimbSubmittedList;
		this.reimbResolvedList = reimbResolvedList;
	}

	public Users(String username, String password, String firstName, String lastName, String email, UserRoles roleId,
			List<Reimbursement> reimbSubmittedList, List<Reimbursement> reimbResolvedList) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roleId = roleId;
		this.reimbSubmittedList = reimbSubmittedList;
		this.reimbResolvedList = reimbResolvedList;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", roleId=" + roleId.getId() + ", reimbSubmittedList="
				+ reimbSubmittedList + ", reimbResolvedList=" + reimbResolvedList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((reimbResolvedList == null) ? 0 : reimbResolvedList.hashCode());
		result = prime * result + ((reimbSubmittedList == null) ? 0 : reimbSubmittedList.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Users other = (Users) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (reimbResolvedList == null) {
			if (other.reimbResolvedList != null)
				return false;
		} else if (!reimbResolvedList.equals(other.reimbResolvedList))
			return false;
		if (reimbSubmittedList == null) {
			if (other.reimbSubmittedList != null)
				return false;
		} else if (!reimbSubmittedList.equals(other.reimbSubmittedList))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRoles getRoleId() {
		return roleId;
	}

	public void setRoleId(UserRoles roleId) {
		this.roleId = roleId;
	}

	public List<Reimbursement> getReimbSubmittedList() {
		return reimbSubmittedList;
	}

	public void setReimbSubmittedList(List<Reimbursement> reimbSubmittedList) {
		this.reimbSubmittedList = reimbSubmittedList;
	}

	public List<Reimbursement> getReimbResolvedList() {
		return reimbResolvedList;
	}

	public void setReimbResolvedList(List<Reimbursement> reimbResolvedList) {
		this.reimbResolvedList = reimbResolvedList;
	}
	
	
}
