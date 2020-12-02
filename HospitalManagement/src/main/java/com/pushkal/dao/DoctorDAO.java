package com.pushkal.dao;

import java.math.BigInteger;
import java.util.List;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Doctor;
import com.pushkal.domain.Patient;
import com.pushkal.domain.Receptionist;

public interface DoctorDAO {
	// for admin
	public Doctor verifyDoctor(Doctor doctor);

	public void saveDoctor(Doctor doctor);

	public List<Doctor> findAllDoctor();
	
	public Doctor getDoctorById(String email);


	//-------------------------------------------------------------

	// for doctor's (Patient)
	public void saveDocPatient(Patient patient);

	public List<Patient> getAllPatientByDoctor(String email);
//--------------------------------------------------------------------
	// for doctor's (Apppointment)

	public void saveDocAppointment(AppointmentBooking appointmentBooking);

	public List<AppointmentBooking> getAllAppointmentByDoctor(String email);
	
	//public List<BigInteger> getAllDoctorb(String email);
	
	

}
