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
@Table(name = "ers_reimbursement_type")
public class ReimbursementType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimb_type_id")
	private int id;
	
	@Column(name = "reimb_type", nullable = false)
	private String type;

	@OneToMany(mappedBy="typeId", fetch=FetchType.EAGER)
	private List<Reimbursement> typeList;
}
