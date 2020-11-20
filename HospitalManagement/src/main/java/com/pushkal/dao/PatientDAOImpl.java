package com.pushkal.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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

	public void savePatAppointment(AppointmentBooking appointmentBooking) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(appointmentBooking);
		tr.commit();
		session.close();	
	}

	// for appointment

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
