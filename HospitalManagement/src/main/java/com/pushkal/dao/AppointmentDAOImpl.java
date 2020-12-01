package com.pushkal.dao;

import java.math.BigInteger;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pushkal.domain.AppointmentBooking;
@Repository
public class AppointmentDAOImpl implements AppointmentDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void saveBooking(AppointmentBooking booking) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(booking);
		transaction.commit();
		session.close();
	}

	public List<AppointmentBooking> getAllBookings() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from AppointmentBooking");
		List<AppointmentBooking> bookings = query.list();
		session.close();
		return bookings;
	}

	public AppointmentBooking getAppointById(BigInteger aid) {
		Session session = sessionFactory.openSession();
		AppointmentBooking appointment = session.get(AppointmentBooking.class, aid);
		session.close();
		return appointment;
	}


}
