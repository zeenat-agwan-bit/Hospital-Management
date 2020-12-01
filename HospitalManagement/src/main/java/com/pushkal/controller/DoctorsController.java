package com.pushkal.controller;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpSession;
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
import com.pushkal.service.AppointmentService;
import com.pushkal.service.DoctorService;
import com.pushkal.service.PatientService;
import com.pushkal.validation.DoctorValidation;

@Controller
public class DoctorsController {
	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PatientService patientService;

	@Autowired
	private AppointmentService appointmentService;

	// ----------------------------------------------------MAPPING FOR
	// ADMINISTRATION PAGE

	@RequestMapping("/doctorlist")
	public ModelAndView showAllDoctors() {
		List<Doctor> doctors = doctorService.showAllDoctors();
		ModelAndView mv = new ModelAndView("doctorlist");
		mv.addObject("dlist", doctors);

		return mv;
	}

	// this method return only login page when request comes to /doctor/
	@RequestMapping("/doctorentry")
	public ModelAndView showDoctorForm() {
		ModelAndView mv = new ModelAndView("doctorentry");
		mv.addObject("doctor", new Doctor());

		return mv;
	}

	@RequestMapping("/savedoctor")
	public String saveDoctor(@Valid @ModelAttribute("doctor") Doctor doctor, BindingResult result) {
		DoctorValidation doctorValidation = new DoctorValidation();
		doctorValidation.validate(doctor, result);
		if (result.hasErrors()) {
			return "doctorentry";
		} else {
			doctorService.addDoctor(doctor);
			return "doctorsave";
		}
	}

	@RequestMapping("/searchbydocid")
	public ModelAndView showSearchButtonDoctor(@RequestParam("findbox") BigInteger find) {
		ModelAndView mv = new ModelAndView("searchbydocid");
		Doctor doctor = doctorService.searchDoctorById(find);
		mv.addObject("doctor", doctor); // request-scope
		return mv;
	}

	@RequestMapping("/adminhomed")
	public String adminHomeD() {
		return "adminpage";
	}

	@RequestMapping("/dlisthome")
	public String plistHomeP() {
		return "redirect:doctorlist";
	}

	// -----------------------------------------MAPPING FOR DOCTOR PAGE (Patient)

	@RequestMapping("/docpatiententry")
	public ModelAndView showDoctorPForm() {
		ModelAndView mv = new ModelAndView("docpatiententry");
		mv.addObject("patient", new Patient());

		return mv;
	}

	@RequestMapping("/savedocpatient")
	public ModelAndView saveDoctorP(@ModelAttribute("patient") Patient patient,

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
		List<Patient> patients = doctorService.findAllPatientsByDoctor(email);
		ModelAndView mv = new ModelAndView("docpatientlist");
		mv.addObject("plist", patients);
		return mv;
	}

	@RequestMapping("updatedocpatient")
	public ModelAndView showPatientUpdateForm(@RequestParam("pid") BigInteger pid) {
		ModelAndView mv = new ModelAndView("docpatientupdateform");
		Patient patient = patientService.searchPatientById(pid);
		mv.addObject("patient", patient);
		return mv;
	}

	@RequestMapping("docpatupdatesave")

	public ModelAndView saveDocpatientChanges(@ModelAttribute("patient") Patient patient,
			@SessionAttribute("email") String email) {
		Doctor doctor = new Doctor();
		doctor.setEmail(email);
		patient.setDoctor(doctor);
		patientService.changePatient(patient);
		ModelAndView mv = new ModelAndView("redirect:docpatientlist");
		return mv;
	}

	@RequestMapping("deletedocpatient")
	public ModelAndView removeDocPatient(@RequestParam("pid") BigInteger pid) {
		patientService.removePatient(pid);
		ModelAndView mv = new ModelAndView("redirect:docpatientlist");
		return mv;
	}

	@RequestMapping("/doctorhomep")
	public String doctorHomep() {
		return "doctorpage";
	}

	// -----------------------------------------MAPPING FOR DOCTOR PAGE
	// (Appointment)

	@RequestMapping("/docappointentry")
	public ModelAndView showDoctorAppointForm(@SessionAttribute("email") String email) {
		ModelAndView mv = new ModelAndView("docappointentry");
		mv.addObject("appointbooking", new AppointmentBooking());
		List<BigInteger> ids = patientService.findAllPatientIds(email);
		mv.addObject("ids", ids);
		return mv;
	}

	@RequestMapping("/savedocappoint")
	public ModelAndView saveDoctorAPP(@ModelAttribute("appointbooking") AppointmentBooking appointmeBooking) {
		appointmentService.addBooking(appointmeBooking);
		ModelAndView mv = new ModelAndView("docappointsave");
		return mv;

	}

	@RequestMapping("docappointlist")
	public ModelAndView showDocAppointList() {
		List<AppointmentBooking> bookings = appointmentService.findAllBookings();
		ModelAndView mv = new ModelAndView("docappointlist");
		mv.addObject("alist", bookings);
		return mv;
	}

	@RequestMapping("/doctorhomea")
	public String doctorHomea() {
		return "doctorpage";
	}

}
