
package com.pushkal.service;

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

	public Patient verifyUserPatient(Patient patient) {

		return dao.verifyPatient(patient);
	}

	public void addPatient(Patient patient) {
		dao.savePatient(patient);
	}

	public List<Patient> findAllPatients() {

		return dao.showAllPatients();
	}

	public void addPatAppointment(AppointmentBooking appointmentBooking) {
		dao.savePatAppointment(appointmentBooking);

	}

}
