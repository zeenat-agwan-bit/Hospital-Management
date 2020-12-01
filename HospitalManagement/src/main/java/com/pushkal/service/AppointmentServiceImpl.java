package com.pushkal.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushkal.dao.AppointmentDAO;
import com.pushkal.domain.AppointmentBooking;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDAO dao;

	public void addBooking(AppointmentBooking booking) {
		dao.saveBooking(booking);

	}

	public List<AppointmentBooking> findAllBookings() {

		return dao.getAllBookings();
	}

	public AppointmentBooking findAppointById(BigInteger aid) {
		// TODO Auto-generated method stub
		return dao.getAppointById(aid);
	}

}
