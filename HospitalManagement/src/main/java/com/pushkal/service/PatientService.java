package com.pushkal.service;

import java.util.List;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Patient;

public interface PatientService {
	
	//admin
	public void addPatient(Patient patient);

	public List<Patient> findAllPatients();
	
	public Patient searchPatientById(String patient_id);
	

	// ------------------------------
	public void addPatAppointment(AppointmentBooking appointmentBooking);

}