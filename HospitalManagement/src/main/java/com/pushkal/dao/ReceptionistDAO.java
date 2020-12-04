package com.pushkal.dao;

import java.util.List;

import com.pushkal.domain.Patient;
import com.pushkal.domain.Receptionist;

public interface ReceptionistDAO {
	public Receptionist verifyReception(Receptionist receptionist);

	public void saveReception(Receptionist receptionist);

	public List<Receptionist> showAllReceptionist();

	public Receptionist getReceptionistById(String email);

	public void updateReception(Receptionist receptionist);

	public void deleteReception(String email);
	
	public List<Receptionist> getReceptionByName(String rname);

	public List<Receptionist> getReceptionByCity(String city);

	// -------------------------------------------

	public void saveRecPatient(Patient patient);

	public List<Patient> getAllPatientByReception(String email);

}
