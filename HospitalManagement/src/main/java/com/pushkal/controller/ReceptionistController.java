package com.pushkal.controller;

import java.math.BigInteger;
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
import com.pushkal.domain.Receptionist;
import com.pushkal.service.AppointmentService;
import com.pushkal.service.DoctorService;
import com.pushkal.service.PatientService;
import com.pushkal.service.ReceptionistService;

@Controller
public class ReceptionistController {
	@Autowired
	private ReceptionistService receptionService;
	@Autowired
	private PatientService patientService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private AppointmentService appointmentService;

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

	@RequestMapping("/searchbyrecid")
	public ModelAndView showSearchButtonReception(@RequestParam("srchbox") String srch) {
		ModelAndView mv = new ModelAndView("searchbyrecid");
		Receptionist receptionist = receptionService.searchReceptionById(srch);
		mv.addObject("receptionist", receptionist); // request-scope
		return mv;
	}

	@RequestMapping("/adminhomer")
	public String adminHomeR() {
		return "adminpage";
	}

	@RequestMapping("/receplistback")
	public String recepList() {
		return "redirect:receplist";
	}

	@RequestMapping("updatereception")
	public ModelAndView showRecepUpdateForm(@RequestParam("email") String email) {
		ModelAndView mv = new ModelAndView("receptionupdateform");
		Receptionist receptionist = receptionService.searchReceptionById(email);
		mv.addObject("receptionist", receptionist);
		return mv;
	}

	@RequestMapping("savereceptionchanges")

	public ModelAndView saveRecepChanges(@ModelAttribute("receptionist") Receptionist receptionist) {

		receptionService.changeReception(receptionist);
		ModelAndView mv = new ModelAndView("redirect:receplist");
		return mv;
	}

	@RequestMapping("deletereception")
	public ModelAndView removeReception(@RequestParam("email") String email) {
		receptionService.removeReception(email);
		ModelAndView mv = new ModelAndView("redirect:receplist");
		return mv;
	}

	@RequestMapping("/searchbyrecname")
	public ModelAndView showSearchNameReception(@RequestParam String rname) {
		ModelAndView mv = new ModelAndView("searchbyrecname");
		List<Receptionist> receptionists = receptionService.findReceptionByName(rname);
		mv.addObject("receptions", receptionists); // request-scope
		return mv;
	}

	@RequestMapping("/searchbyreccity")
	public ModelAndView showSearchCityReception(@RequestParam String city) {
		ModelAndView mv = new ModelAndView("searchbyreccity");
		List<Receptionist> receptionists = receptionService.findReceptionByCity(city);
		mv.addObject("receptions", receptionists); // request-scope
		return mv;
	}

	@RequestMapping("/rlisthome")
	public String rlistHomeP() {
		return "redirect:receplist";
	}

//----------------------------------------------------------------------------------------------------------------------
	@RequestMapping("/recpatiententry")
	public ModelAndView showRecPForm() {
		ModelAndView mv = new ModelAndView("recpatiententry");
		mv.addObject("patient", new Patient());
		/*
		 * List<String> emails = doctorService.findAllDoctorB(); mv.addObject("emails",
		 * emails);
		 */
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
	public ModelAndView showRecPatientList(@SessionAttribute("email") String email) {
		List<Patient> patients = receptionService.findAllPatientsByReception(email);
		ModelAndView mv = new ModelAndView("recpatientlist");
		mv.addObject("plist", patients);
		return mv;
	}

	@RequestMapping("updaterecpatient")
	public ModelAndView showPatientUpdateeForm(@RequestParam("pid") BigInteger pid) {
		ModelAndView mv = new ModelAndView("recpatientupdateform");
		Patient patient = patientService.searchPatientById(pid);
		mv.addObject("patient", patient);
		return mv;
	}

	@RequestMapping("recpatupdatesave")

	public ModelAndView saveRecPatientChanges(@ModelAttribute("patient") Patient patient,
			@SessionAttribute("email") String email) {
		Receptionist receptionist = new Receptionist();
		receptionist.setEmail(email);
		patient.setReceptionist(receptionist);
		patientService.changePatient(patient);
		ModelAndView mv = new ModelAndView("redirect:recpatientlist");
		return mv;
	}

	@RequestMapping("deleterecpatient")
	public ModelAndView removeRecPatient(@RequestParam("pid") BigInteger pid) {
		patientService.removePatient(pid);
		ModelAndView mv = new ModelAndView("redirect:recpatientlist");
		return mv;
	}

	@RequestMapping("/rechomep")
	public String doctorHomep() {
		return "receptionpage";
	}

	// -----------------------------------------MAPPING FOR Reception PAGE
	// (Appointment)

	@RequestMapping("/recappointentry")
	public ModelAndView showRecAppointForm(@SessionAttribute("email") String email) {
		ModelAndView mv = new ModelAndView("recappointentry");
		mv.addObject("appointbooking", new AppointmentBooking());
		Receptionist receptionist = new Receptionist();
		receptionist.setEmail(email);
		List<BigInteger> ids = patientService.findAllRPatientIds(email);
		mv.addObject("ids", ids);
		List<String> emails = doctorService.findAllDoctorB();
		mv.addObject("emails", emails);
		return mv;
	}

	@RequestMapping("/saverecappoint")
	public ModelAndView saveRecepAPP(@ModelAttribute("appointbooking") AppointmentBooking appointmeBooking) {
		appointmentService.addBooking(appointmeBooking);
		ModelAndView mv = new ModelAndView("recappointsave");
		return mv;

	}

	@RequestMapping("recappointlist")
	public ModelAndView showRecAppointList() {
		List<AppointmentBooking> bookings = appointmentService.findAllBookings();
		ModelAndView mv = new ModelAndView("recappointlist");
		mv.addObject("alist", bookings);
		return mv;
	}

	@RequestMapping("/recephomea")
	public String recepHomea() {
		return "receptionpage";
	}
}
