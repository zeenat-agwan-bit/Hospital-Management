package com.pushkal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.pushkal.domain.AppointmentBooking;
import com.pushkal.domain.Doctor;
import com.pushkal.domain.Patient;
import com.pushkal.service.DoctorService;
import com.pushkal.service.PatientService;

@Controller
public class DoctorsController {
	@Autowired
	private DoctorService doctorService;

	
	  @Autowired private PatientService patientService;
	 
	// ----------------------------------------------------MAPPING FOR
	// ADMINISTRATION PAGE

	@RequestMapping("/doctorlist")
	public ModelAndView showAllDoctors() {
		List<Doctor> doctors = doctorService.showAllDoctors();
		ModelAndView mv = new ModelAndView("doctorlist");
		mv.addObject("dlist", doctors);

		return mv;
	}

	@RequestMapping("/doctorentry")
	public ModelAndView showDoctorForm() {
		ModelAndView mv = new ModelAndView("doctorentry");
		mv.addObject("doctor", new Doctor());

		return mv;
	}

	@RequestMapping("/savedoctor")
	public String saveDoctor(@Valid @ModelAttribute("doctor") Doctor doctor, BindingResult result) {
		if (result.hasErrors()) {
			return "doctorentry";
		}
		doctorService.addDoctor(doctor);
		return "doctorsave";

	}
	
	
	@RequestMapping("/searchbydocid")
	public ModelAndView showSearchButtonDoctor(@RequestParam("findbox") String find) {
		ModelAndView mv = new ModelAndView("searchbydocid");
		Doctor doctor = doctorService.searchDoctorById(find);
		mv.addObject("doctor", doctor); // request-scope
		return mv;
	}

	@RequestMapping("/adminhomed")
	public String adminHomeD() {
		return "adminpage";
	}

	// -----------------------------------------MAPPING FOR DOCTOR PAGE (Patient)

	@RequestMapping("/docpatiententry")
	public ModelAndView showDoctorPForm() {
		ModelAndView mv = new ModelAndView("docpatiententry");
		mv.addObject("patient", new Patient());

		return mv;
	}

	/*
	 * @RequestMapping("/savedocpatient") public String
	 * saveDoctorP(@Valid @ModelAttribute("patient") Patient patient, BindingResult
	 * result) { if (result.hasErrors()) { return "docpatiententry"; }
	 * doctorService.addDocPatient(patient); return "docpatientsave";
	 * 
	 * }
	 */

	@RequestMapping("/savedocpatient")
	public ModelAndView saveDoctorP(@Valid @ModelAttribute("patient") Patient patient,
			@Valid @ModelAttribute("appointbooking") AppointmentBooking appointmentBooking,

			@SessionAttribute("email") String email) {
		Doctor doctor = new Doctor();
		doctor.setEmail(email);
		patient.setDoctor(doctor);
		doctorService.addDocPatient(patient);
		ModelAndView mv = new ModelAndView("docpatientsave");
		return mv;

	}

	@RequestMapping("docpatientlist")
	public ModelAndView showDocPatientList(@SessionAttribute("email") String email) {
		// System.out.println("EMAIL : "+email);
		List<Patient> patients = doctorService.findAllPatientsByDoctor(email);
		ModelAndView mv = new ModelAndView("docpatientlist");
		mv.addObject("plist", patients);
		return mv;
	}

	@RequestMapping("/doctorhomep")
	public String doctorHomep() {
		return "doctorpage";
	}

	// -----------------------------------------MAPPING FOR DOCTOR PAGE
	// (Appointment)

	@RequestMapping("/docappointentry")
	public ModelAndView showDoctorAppointForm() {
		ModelAndView mv = new ModelAndView("docappointentry");
		mv.addObject("patient", new Patient());
		mv.addObject("appointbooking", new AppointmentBooking());
		return mv;
	}

	

	@RequestMapping("/savedocappoint")
	public ModelAndView saveDoctorAPP(@Valid @ModelAttribute("patient") Patient patient,
			@Valid @ModelAttribute("appointbooking") AppointmentBooking appointmentBooking,
			@SessionAttribute("email") String email) {
		Doctor doctor = new Doctor();
		doctor.setEmail(email);
		patient.setDoctor(doctor);
		appointmentBooking.setDoctor(doctor);
		appointmentBooking.setPatient(patient);
		patientService.addPatAppointment(appointmentBooking);
		doctorService.addDocPatient(patient);
		doctorService.addDocAppointment(appointmentBooking);
		ModelAndView mv = new ModelAndView("docappointsave");
		return mv;

	}

	@RequestMapping("docappointlist")
	public ModelAndView showDocAppointList(@SessionAttribute("email") String email) {
		// System.out.println("EMAIL : "+email);
		List<Patient> patients = doctorService.findAllPatientsByDoctor(email);
		List<AppointmentBooking> bookings = doctorService.findAllAppointmentsByDoctor(email);
		ModelAndView mv = new ModelAndView("docappointlist");
		mv.addObject("alist", bookings);
		return mv;
	}

	@RequestMapping("/doctorhomea")
	public String doctorHomea() {
		return "doctorpage";
	}
	
	
}
