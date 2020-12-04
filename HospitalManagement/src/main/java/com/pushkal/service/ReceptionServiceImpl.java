
package com.pushkal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushkal.dao.ReceptionistDAO;
import com.pushkal.domain.Patient;
import com.pushkal.domain.Receptionist;

@Service
public class ReceptionServiceImpl implements ReceptionistService {

	@Autowired
	public ReceptionistDAO dao;

	public Receptionist verifyReceptiont(Receptionist receptionist) {

		return dao.verifyReception(receptionist);

	}

	public void addReceptionist(Receptionist receptionist) {
		dao.saveReception(receptionist);

	}

	public List<Receptionist> FindAllReceptionist() {
		return dao.showAllReceptionist();
	}

	public void addRecPatient(Patient patient) {
		dao.saveRecPatient(patient);

	}

	public List<Patient> findAllPatientsByReception(String email) {
		return dao.getAllPatientByReception(email);
	}

	public Receptionist searchReceptionById(String email) {
		return dao.getReceptionistById(email);
	}

	public void changeReception(Receptionist receptionist) {
		dao.updateReception(receptionist);
	}

	public void removeReception(String email) {
		dao.deleteReception(email);
	}

	public List<Receptionist> findReceptionByName(String rname) {

		return dao.getReceptionByName(rname);
	}

	public List<Receptionist> findReceptionByCity(String city) {
		return dao.getReceptionByCity(city);
	}

}
