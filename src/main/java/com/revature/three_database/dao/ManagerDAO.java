package com.revature.three_database.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.ManagerAcceptDTO;
import com.revature.models.ManagerDTO;
import com.revature.models.ManagerRejectDTO;
import com.revature.three_database.interfaces.ManagerInterface;
import com.revature.three_database.models.Reimbursement;
import com.revature.three_database.models.ReimbursementStatus;
import com.revature.utils.HibernateUtil;

public class ManagerDAO implements ManagerInterface {

	public static List<Reimbursement> getPendingReimbursements(ManagerDTO mngDTO) {

		Session session = HibernateUtil.getSession();
		
		@SuppressWarnings("unchecked")
		List<Reimbursement> reimb = session.createQuery("FROM Reimbursement WHERE statusId = 1").list();
		HibernateUtil.closeSession();
		
		if(reimb != null){
			return reimb;
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	public static boolean acceptReimbursement(ManagerAcceptDTO mngAcceptDTO) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			System.out.println("reimbId: " + mngAcceptDTO.getReimbId());
			ReimbursementStatus rStatus = (ReimbursementStatus) session.createQuery("FROM ReimbursementStatus WHERE status = ?1")
				.setParameter(1, mngAcceptDTO.getStatus()).uniqueResult();
			Reimbursement reimb = (Reimbursement) session.createQuery("FROM Reimbursement WHERE id = ?1")
				.setParameter(1, Integer.parseInt(mngAcceptDTO.getReimbId())).uniqueResult();
			session.detach(reimb);
			reimb.setResolved(LocalDateTime.now());
			reimb.setStatusId(rStatus);
			session.update(reimb);
			tx.commit();
			HibernateUtil.closeSession();
			return true;
		}
		catch(Exception e) {
			System.out.println("Update Failed");
			return false;
		}
		
	}

	public static boolean rejectReimbursement(ManagerRejectDTO mngRejectDTO) {
		
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			System.out.println("reimbId: " + mngRejectDTO.getReimbId());
			ReimbursementStatus rStatus = (ReimbursementStatus) session.createQuery("FROM ReimbursementStatus WHERE status = ?1")
				.setParameter(1, mngRejectDTO.getStatus()).uniqueResult();
			Reimbursement reimb = (Reimbursement) session.createQuery("FROM Reimbursement WHERE id = ?1")
				.setParameter(1, Integer.parseInt(mngRejectDTO.getReimbId())).uniqueResult();
			session.detach(reimb);
			reimb.setResolved(LocalDateTime.now());
			reimb.setStatusId(rStatus);
			session.update(reimb);
			tx.commit();
			HibernateUtil.closeSession();
			return true;
		}
		catch(Exception e) {
			System.out.println("Update Failed");
			return false;
		}
	}

	public static List<Reimbursement> getPastReimbursements(ManagerDTO mngDTO) {
		Session session = HibernateUtil.getSession();
		
		@SuppressWarnings("unchecked")
		List<Reimbursement> reimb = session.createQuery("FROM Reimbursement WHERE statusId = 2 OR statusId = 3").list();
		HibernateUtil.closeSession();
		
		if(reimb != null){
			return reimb;
		}
		
		return null;
	}

}
