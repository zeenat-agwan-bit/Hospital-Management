package com.pushkal.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void savePatient(Patient patient) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(patient);
		tr.commit();
		session.close();
	}

	public List<Patient> showAllPatients() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Patient");
		List<Patient> patients = query.list();
		session.close();
		return patients;
	}

	
	public Patient getPatientById(BigInteger pid) {
		Session session = sessionFactory.openSession();
		Patient patient = session.get(Patient.class, pid);
		return patient;
	}
	
	
	
	public void updatePatient(Patient patient) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(patient);
		tr.commit();
		session.close();

	}

	public void deletePatient(BigInteger pid) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Patient patient = session.get(Patient.class, pid);
		session.delete(patient);
		tr.commit();
		session.close();

	}
	//--------------------------------------------------------------------
	
	
	public void savePatAppointment(AppointmentBooking appointmentBooking) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(appointmentBooking);
		tr.commit();
		session.close();
	}

	

	

	public List<Patient> getPatientByName(String pName) {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("pName", pName));
		List<Patient> patients = cr.list();
		session.close();
		return patients;
	}

	public List<Patient> getPatientByCity(String city) {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("city", city));
		List<Patient> patients = cr.list();
		session.close();
		return patients;
	}

	

	public List<BigInteger> getAllPatientb() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Patient.class);
		List<Patient> plist = criteria.list();
		List<BigInteger> ids = new ArrayList<BigInteger>();
		for (Patient p : plist) {
			ids.add(p.getPid());
		}
		return ids;

	}
	// for appointment

	public List<BigInteger> getAllPatientIds(String email) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Patient.class);
		Criterion crt=Restrictions.eq("doctor.email", email);
		criteria.add(crt);
		List<Patient> plist = criteria.list();
		List<BigInteger> ids = new ArrayList<BigInteger>();
		for (Patient p : plist) {
			ids.add(p.getPid());
		}
		return ids;

	}

	/*
	 * public List<String> getAllEmails(String email) { Session session =
	 * sessionFactory.openSession(); Criteria criteria =
	 * session.createCriteria(Patient.class); Criterion crt =
	 * Restrictions.eq("doctor.email", email); // QBC filteration criteria.add(crt);
	 * List<Patient> plist = criteria.list(); List<String> emails = new
	 * ArrayList<String>(); for (Patient p : plist) { emails.add(p.getEmail()); }
	 * return emails; }
	 */

}
