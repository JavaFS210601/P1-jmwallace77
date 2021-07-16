package com.revature.three_database.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;

import com.revature.models.EmployeeDTO;
import com.revature.models.EmployeeSubmitDTO;
import com.revature.three_database.interfaces.EmployeeInterface;
import com.revature.three_database.models.Reimbursement;
import com.revature.three_database.models.ReimbursementStatus;
import com.revature.three_database.models.ReimbursementType;
import com.revature.three_database.models.Users;
import com.revature.utils.HibernateUtil;

public class EmployeeDAO implements EmployeeInterface {

	@SuppressWarnings("unchecked")
	public boolean submitReimbursementRequest(EmployeeSubmitDTO empDTO) {
		try {
			System.out.println(empDTO.getFirstName() + " " + empDTO.getLastName() 
			+ " UserId: " + empDTO.getUserId() + " ReimbType: " + empDTO.getReimbType());
			
			Session session = HibernateUtil.getSession();
			Users user = session.get(Users.class, Integer.parseInt(empDTO.getUserId()));
			ReimbursementStatus rStatus = session.get(ReimbursementStatus.class, 1);
			ReimbursementType rType = (ReimbursementType) session.createQuery("FROM ReimbursementType WHERE id = ?1")
					.setParameter(1, Integer.parseInt(empDTO.getReimbType())).uniqueResult();
			Reimbursement reimb = (Reimbursement) session.createQuery("FROM Reimbursement WHERE id=(SELECT MAX(id) FROM Reimbursement)").uniqueResult();
			reimb = new Reimbursement(Integer.parseInt(empDTO.getAmount()), LocalDateTime.now(), user, rStatus, rType);
			
			session.save(reimb);
			
			HibernateUtil.closeSession();
			return true;
		}catch(Exception e) {
			System.out.println("Insert Failed");
			return false;
		}
		
	}

	public static List<Reimbursement> getPendingReimbursements(EmployeeDTO empDTO) {
		Session session = HibernateUtil.getSession();
		
		@SuppressWarnings("unchecked")
		List<Reimbursement> reimb = session.createQuery("FROM Reimbursement WHERE statusId = 1 AND author = (SELECT id FROM Users WHERE id = ?1)")
					.setParameter(1, Integer.parseInt(empDTO.getUserId())).list();
		HibernateUtil.closeSession();
		
		if(reimb != null){
			return reimb;
		}
		
		return null;
	}

	public static List<Reimbursement> getPastReimbursements(EmployeeDTO empDTO) {
		Session session = HibernateUtil.getSession();
		
		@SuppressWarnings("unchecked")
		List<Reimbursement> reimb = session.createQuery("FROM Reimbursement WHERE statusId != 1 AND author = (SELECT id FROM Users WHERE id = ?1)")
					.setParameter(1, Integer.parseInt(empDTO.getUserId())).list();
		HibernateUtil.closeSession();
		
		if(reimb != null){
			return reimb;
		}
		
		return null;
	}

}
