package com.pushkal.service;

import java.math.BigInteger;
import java.util.List;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Patient;

public interface PatientService {

	// admin
	public void addPatient(Patient patient);

	public void changePatient(Patient patient);

	public void removePatient(BigInteger pid);

	public List<Patient> findAllPatients();

	public Patient searchPatientById(BigInteger pid);

	public List<Patient> findPatientByName(String pName);

	public List<Patient> findPatientByCity(String city);

	public List<BigInteger> getAllPatientB();

	public List<BigInteger> findAllPatientIds(String email);
	// ------------------------------
	public void addPatAppointment(AppointmentBooking appointmentBooking);

}