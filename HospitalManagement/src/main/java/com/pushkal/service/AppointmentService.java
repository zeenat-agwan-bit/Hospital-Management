package com.pushkal.service;

import java.util.List;

import com.pushkal.domain.AppointmentBooking;

public interface AppointmentService {
	public void addBooking(AppointmentBooking booking);

	public List<AppointmentBooking> findAllBookings();

	// public void changeBooking(AppointmentBooking booking);

	// public List<AppointmentBooking> findAllBookings(Time time);

	// public List<AppointmentBooking> findAllBookingByDoctor(String email);

	// public List<AppointmentBooking> findAllBookingsByDate(String date);

}
