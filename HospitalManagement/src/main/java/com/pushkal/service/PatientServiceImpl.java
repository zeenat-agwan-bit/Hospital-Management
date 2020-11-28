
package com.pushkal.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushkal.dao.PatientDAO;
import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO dao;

	public void addPatient(Patient patient) {
		dao.savePatient(patient);
	}

	public List<Patient> findAllPatients() {

		return dao.showAllPatients();
	}

	public void addPatAppointment(AppointmentBooking appointmentBooking) {
		dao.savePatAppointment(appointmentBooking);

	}

	public Patient searchPatientById(BigInteger patient_id) {
		return dao.getPatientById(patient_id);
	}

	public void changePatient(Patient patient) {
		dao.updatePatient(patient);

	}

	public void removePatient(BigInteger patient_id) {
		dao.deletePatient(patient_id);
	}

	public List<Patient> findPatientByName(String pName) {
		return dao.getPatientByName(pName);
	}

	public List<Patient> findPatientByCity(String city) {
		return dao.getPatientByCity(city);
	}

	
}
