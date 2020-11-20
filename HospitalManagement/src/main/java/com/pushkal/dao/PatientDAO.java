package com.pushkal.dao;

import java.util.List;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Patient;

public interface PatientDAO {
	//For admin
	
	public void savePatient(Patient patient);

	public List<Patient> showAllPatients();
	
	public Patient getPatientById(String patient_id);
	
	
//---------------------------------------------------

	public void savePatAppointment(AppointmentBooking appointmentBooking);

	
	
}
