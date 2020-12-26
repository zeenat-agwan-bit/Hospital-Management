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

	public Doctor findDoctorById(String email);

	public void EditDoctor(Doctor doctor);

	public void RemoveDoctor(String email);
	
	public List<Doctor> findDoctorByName(String dname);

	public List<Doctor> findDoctorByCity(String city);
	
	public List<Doctor> findDoctorBySpcl(String specialization);
	
	public List<String> findAllDoctorSpcl();
	
	public List<String> findAllDoctorB();


	// For Doctor Page(Patient)

	public void addDocPatient(Patient patient);

	public List<Patient> findAllPatientsByDoctor(String email);

	// For Doctor Page(Appointment)

	public void addDocAppointment(AppointmentBooking appointmentBooking);

	public List<AppointmentBooking> findAllAppointmentsByDoctor(String email);

}
