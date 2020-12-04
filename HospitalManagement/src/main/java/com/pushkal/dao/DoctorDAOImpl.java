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

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Doctor;
import com.pushkal.domain.Patient;

@Repository
public class DoctorDAOImpl implements DoctorDAO {
	@Autowired
	private SessionFactory sessionFactory;

	// --------------------------------MAPPING FOR ADMIN PAGE :

	public Doctor verifyDoctor(Doctor doctor) {
		Session session = sessionFactory.openSession();

		Doctor doc = session.get(Doctor.class, doctor.getEmail());
		if (doc == null) {
			return null;
		} else {
			if (doctor.getPassword().equals(doc.getPassword())) {
				return doc;
			} else {
				return null;
			}
		}
	}

	/*
	 * public Doctor verifyDoctor(Doctor doctor) { Session session =
	 * sessionFactory.openSession(); Transaction tr = session.beginTransaction();
	 * String hql = "from Doctor as d where d.email=? and d.password=?"; try { Query
	 * query = session.createQuery(hql); query.setParameter(0, doctor.getEmail());
	 * query.setParameter(1, doctor.getPassword()); doctor = (Doctor)
	 * query.uniqueResult(); tr.commit(); session.close(); } catch (Exception e) {
	 * tr.rollback(); session.close(); e.printStackTrace(); } return doctor;
	 * 
	 * }
	 */

	public void saveDoctor(Doctor doctor) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		if (doctor != null) {
			try {
				session.save(doctor);
				tr.commit();
				session.close();
			} catch (Exception e) {
				tr.rollback();
				session.close();
				e.printStackTrace();
			}
		}
	}

	public Doctor getDoctorById(String email) {
		Session session = sessionFactory.openSession();
		Doctor doctor = session.get(Doctor.class, email);
		return doctor;
	}

	public List<Doctor> findAllDoctor() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Doctor");
		List<Doctor> doctors = query.list();
		session.close();
		return doctors;

	}
	
	
	public void updateDoctor(Doctor doctor) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(doctor);
		tr.commit();
		session.close();
	}

	public void deleteDoctor(String email) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Doctor doctor = session.get(Doctor.class, email);
		session.delete(doctor);
		tr.commit();
		session.close();
	}
	
	
	

	// --------------------------------MAPPING FOR DOCTOR PAGE :

	public void saveDocPatient(Patient patient) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(patient);
		tr.commit();
		session.close();
	}

	public List<Patient> getAllPatientByDoctor(String email) {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		Criterion crt = Restrictions.eq("doctor.email", email);
		cr.add(crt);
		List<Patient> patients = cr.list();
		session.close();
		return patients;
	}

	public void saveDocAppointment(AppointmentBooking appointmentBooking) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(appointmentBooking);
		tr.commit();
		session.close();
	}

	public List<AppointmentBooking> getAllAppointmentByDoctor(String email) {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(AppointmentBooking.class);
		Criterion crt = Restrictions.eq("doctor.email", email);
		cr.add(crt);
		List<AppointmentBooking> bookings = cr.list();
		session.close();
		return bookings;
	}

	public List<Doctor> getDoctorByName(String dname) {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.eq("dname", dname));
		List<Doctor> doctors = cr.list();
		session.close();
		return doctors;
	}

	public List<Doctor> getDoctorByCity(String city) {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.eq("city", city));
		List<Doctor> doctors = cr.list();
		session.close();
		return doctors;
	}

	

	/*
	 * public List<BigInteger> getAllDoctorb(String email) { Session session =
	 * sessionFactory.openSession(); Criteria criteria =
	 * session.createCriteria(Doctor.class); Criterion crt =
	 * Restrictions.eq("doctor.email", email); criteria.add(crt); List<Doctor> dlist
	 * = criteria.list(); List<BigInteger> ids = new ArrayList<BigInteger>(); for
	 * (Doctor d : dlist) { ids.add(d.getDid()); } return ids;
	 * 
	 * }
	 */

}
