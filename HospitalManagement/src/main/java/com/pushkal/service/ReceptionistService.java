
package com.pushkal.service;

import java.util.List;

import com.pushkal.domain.Patient;
import com.pushkal.domain.Receptionist;

public interface ReceptionistService {

	public Receptionist verifyReceptiont(Receptionist receptionist);

	public void addReceptionist(Receptionist receptionist);

	public List<Receptionist> FindAllReceptionist();

	public void addRecPatient(Patient patient);
	
	public Receptionist searchReceptionById(String email);

	public List<Patient> findAllPatientsByReception(String email);
	
	public void changeReception(Receptionist receptionist);

	public void removeReception(String email);
	
	public List<Receptionist> findReceptionByName(String rname);

	public List<Receptionist> findReceptionByCity(String city);



}