package com.pushkal.dao;

import java.util.List;

import com.pushkal.domain.AppointmentBooking;

public interface AppointmentDAO {
	public void saveBooking(AppointmentBooking booking);

	// public void updateBooking(AppointmentBooking booking);

	// public List<AppointmentBooking> getAllBookings(String time);

	public List<AppointmentBooking> getAllBookings();

	// public List<AppointmentBooking> getAllBookingByDoctor(String email);

	// public List<AppointmentBooking> getAllBookings(String date);

}
