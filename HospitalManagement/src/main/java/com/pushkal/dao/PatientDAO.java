package com.pushkal.dao;

import java.math.BigInteger;
import java.util.List;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Patient;

public interface PatientDAO {
	// For admin

	public void savePatient(Patient patient);

	public void updatePatient(Patient patient);

	public void deletePatient(BigInteger pid);

	public List<Patient> showAllPatients();

	public Patient getPatientById(BigInteger pid);

	public List<Patient> getPatientByName(String pName);

	public List<Patient> getPatientByCity(String city);

	public List<BigInteger> getAllPatientb();

//---------------------------------------------------

	public void savePatAppointment(AppointmentBooking appointmentBooking);

}
