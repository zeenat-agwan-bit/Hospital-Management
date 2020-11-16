
package com.pushkal.service;

import java.util.List;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Patient;

public interface PatientService {
	public Patient verifyUserPatient(Patient patient);

	public void addPatient(Patient patient);

	public List<Patient> findAllPatients();

	// ------------------------------
	public void addPatAppointment(AppointmentBooking appointmentBooking);

}