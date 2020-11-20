
package com.pushkal.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pushkal.domain.Patient;
import com.pushkal.service.PatientService;

@Controller
public class PatientController {
	@Autowired
	private PatientService patientService;

//--------------------------------------------MAPPING FOR ADMINISTRATION
	@RequestMapping("/patientlist")
	public ModelAndView showAllDoctors() {
		List<Patient> patients = patientService.findAllPatients();
		ModelAndView mv = new ModelAndView("patientlist");
		mv.addObject("plist", patients);

		return mv;
	}

	@RequestMapping("/patiententry")
	public ModelAndView showPatientForm() {
		ModelAndView mv = new ModelAndView("patiententry");
		mv.addObject("patient", new Patient());

		return mv;
	}

	@RequestMapping("/savepatient")
	public String savePatient(@Valid @ModelAttribute("patient") Patient patient, BindingResult result) {
		if (result.hasErrors()) {
			return "patiententry";
		}
		patientService.addPatient(patient);
		return "patientsave";

	}

	@RequestMapping("/searchbypatid")
	public ModelAndView showSearchButtonPatient(@RequestParam("querybox") String query) {
		ModelAndView mv = new ModelAndView("searchbypatid");
		Patient patient = patientService.searchPatientById(query);
		mv.addObject("patient", patient); // request-scope
		return mv;
	}

	@RequestMapping("/adminhomep")
	public String adminHomeP() {
		return "adminpage";
	}

	// ----------------------------------------------

}
