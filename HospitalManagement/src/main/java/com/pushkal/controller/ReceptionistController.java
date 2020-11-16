
package com.pushkal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.pushkal.domain.Doctor;
import com.pushkal.domain.Patient;
import com.pushkal.domain.Receptionist;
import com.pushkal.service.ReceptionistService;

@Controller
public class ReceptionistController {
	@Autowired
	private ReceptionistService receptionService;

	@RequestMapping("/receplist")
	public ModelAndView showAllReceptionists() {
		List<Receptionist> receptionists = receptionService.FindAllReceptionist();
		ModelAndView mv = new ModelAndView("receplist");
		mv.addObject("rlist", receptionists);

		return mv;
	}

	@RequestMapping("/recepentry")
	public ModelAndView showDoctorForm() {
		ModelAndView mv = new ModelAndView("recepentry");
		mv.addObject("receptionist", new Receptionist());

		return mv;
	}

	@RequestMapping("/savereception")
	public String saveReception(@Valid @ModelAttribute("receptionist") Receptionist receptionist,
			BindingResult result) {
		if (result.hasErrors()) {
			return "recepentry";
		}
		receptionService.addReceptionist(receptionist);
		return "receptionsave";

	}

	@RequestMapping("/adminhomer")
	public String adminHomeR() {
		return "adminpage";
	}

	@RequestMapping("/recpatiententry")
	public ModelAndView showRecPForm() {
		ModelAndView mv = new ModelAndView("recpatiententry");
		mv.addObject("patient", new Patient());

		return mv;
	}

	@RequestMapping("/saverecpatient")
	public ModelAndView saveRecepP(@Valid @ModelAttribute("patient") Patient patient,
			@SessionAttribute("email") String email) {
		Receptionist receptionist = new Receptionist();
		receptionist.setEmail(email);
		patient.setReceptionist(receptionist);
		receptionService.addRecPatient(patient);
		ModelAndView mv = new ModelAndView("recpatientsave");
		return mv;

	}

	@RequestMapping("recpatientlist")
	public ModelAndView showDocPatientList(@SessionAttribute("email") String email) {
		// System.out.println("EMAIL : "+email);
		List<Patient> patients = receptionService.findAllPatientsByReception(email);
		ModelAndView mv = new ModelAndView("recpatientlist");
		mv.addObject("plist", patients);
		return mv;
	}

	@RequestMapping("/rechomep")
	public String doctorHomep() {
		return "receptionpage";
	}

}
