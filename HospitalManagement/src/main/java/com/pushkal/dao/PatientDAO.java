package com.pushkal.dao;

import java.util.List;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Patient;

public interface PatientDAO {
	//For admin
	
	public Patient verifyPatient(Patient patient);

	public void savePatient(Patient patient);

	public List<Patient> showAllPatients();
	
	
//---------------------------------------------------

	public void savePatAppointment(AppointmentBooking appointmentBooking);

	
	
}
