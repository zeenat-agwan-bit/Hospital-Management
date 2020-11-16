package com.pushkal.service;

import java.util.List;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Doctor;
import com.pushkal.domain.Patient;

public interface DoctorService {

	// For Admin Page

	public Doctor verifyUserDoctor(Doctor doctor);

	public void addDoctor(Doctor doctor);

	public List<Doctor> showAllDoctors();

	// For Doctor Page(Patient)

	public void addDocPatient(Patient patient);

	public List<Patient> findAllPatientsByDoctor(String email);

	// For Doctor Page(Appointment)

	public void addDocAppointment(AppointmentBooking appointmentBooking);

	public List<AppointmentBooking> findAllAppointmentsByDoctor(String email);

}
