package com.pushkal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pushkal.domain.Patient;
import com.pushkal.domain.Receptionist;

@Repository
public class ReceptionistDAOImpl implements ReceptionistDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Receptionist verifyReception(Receptionist receptionist) {
		Session session = sessionFactory.openSession();

		Receptionist reception = session.get(Receptionist.class, receptionist.getEmail());
		if (reception == null) {
			return null;
		} else {
			if (receptionist.getPassword().equals(reception.getPassword())) {
				return reception;
			} else {
				return null;
			}
		}
	}

	public void saveReception(Receptionist receptionist) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(receptionist);
		tr.commit();
		session.close();
	}

	public List<Receptionist> showAllReceptionist() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Receptionist");
		List<Receptionist> receptionists = query.list();
		session.close();
		return receptionists;
	}

	public void saveRecPatient(Patient patient) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(patient);
		tr.commit();
		session.close();
	}

	public List<Patient> getAllPatientByReception(String email) {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		Criterion crt = Restrictions.eq("receptionist.email", email);
		cr.add(crt);
		List<Patient> patients = cr.list();
		session.close();
		return patients;
	}

	public Receptionist getReceptionistById(String email) {
		Session session = sessionFactory.openSession();
		Receptionist receptionist = session.get(Receptionist.class, email);
		return receptionist;
	}

}
