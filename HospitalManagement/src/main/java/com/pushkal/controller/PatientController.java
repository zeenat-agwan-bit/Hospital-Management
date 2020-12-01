
package com.pushkal.controller;

import java.math.BigInteger;
import java.util.ArrayList;
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

	@RequestMapping("/updatepatientform")
	public ModelAndView showUpdateForm(@RequestParam("id") BigInteger pid) {
		ModelAndView mv = new ModelAndView("patientupdateform");
		Patient patient = patientService.searchPatientById(pid);
		mv.addObject("patient", patient);
		/*
		 * List<String> bloods = new ArrayList<String>(); bloods.add("A+");
		 * bloods.add("A-"); bloods.add("B+"); bloods.add("B-"); bloods.add("O+");
		 * bloods.add("O-"); bloods.add("AB+"); bloods.add("AB-");
		 * mv.addObject("bloods", bloods);
		 */

		return mv;
	}

	@RequestMapping("/updatepatient")
	public ModelAndView updatePatient(@ModelAttribute("patient") Patient patient) {
		patientService.changePatient(patient);
		ModelAndView mv = new ModelAndView("patientupdated");
		return mv;
	}

	@RequestMapping("/deletepatient")
	public ModelAndView deletePatient(@RequestParam("id") BigInteger pid) {
		patientService.removePatient(pid);
		ModelAndView mv = new ModelAndView("redirect:patientlist");
		return mv;
	}

	@RequestMapping("/patientlist")
	public ModelAndView showAllPatients() {
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
	public ModelAndView showSearchButtonPatient(@RequestParam("querybox") BigInteger query) {
		ModelAndView mv = new ModelAndView("searchbypatid");
		Patient patient = patientService.searchPatientById(query);
		mv.addObject("patient", patient); // request-scope
		return mv;
	}

	@RequestMapping("/searchbypatname")
	public ModelAndView showSearchNamePatient(@RequestParam  String pName) {
		ModelAndView mv = new ModelAndView("searchbypatname");
		List<Patient> patients = patientService.findPatientByName(pName);
		mv.addObject("patients", patients); // request-scope
		return mv;
	}

	@RequestMapping("/searchbypatcity")
	public ModelAndView showSearchCityPatient(@RequestParam String city) {
		ModelAndView mv = new ModelAndView("searchbypatcity");
		List<Patient> patients = patientService.findPatientByCity(city);
		mv.addObject("patients", patients); // request-scope
		return mv;
	}
	

	@RequestMapping("/plisthome")
	public String plistHomeP() {
		return "redirect:patientlist";
	}

	@RequestMapping("/adminhomep")
	public String adminHomeP() {
		return "adminpage";
	}

	// --------------------NEW PATIENT --------------------------
	@RequestMapping("/newpatient")
	public ModelAndView newPatientForm() {
		ModelAndView mv = new ModelAndView("newpatient");
		mv.addObject("patient", new Patient());

		return mv;
	}

	@RequestMapping("/savenewpatient")
	public String saveNewPatient(@Valid @ModelAttribute("patient") Patient patient, BindingResult result) {
		if (result.hasErrors()) {
			return "newpatient";
		}
		patientService.addPatient(patient);
		return "newpatientsave";

	}

}
