package com.pushkal.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.pushkal.domain.*;
import com.pushkal.service.AppointmentService;

@Controller
public class BookingController {

	@Autowired
	private AppointmentService appointmentService;

	// for appointment(admin)

	@RequestMapping("appointentry")
	public ModelAndView showAppointEntryForm() {
		ModelAndView mv = new ModelAndView("appointentry");
		mv.addObject("booking", new AppointmentBooking());
		return mv;
	}

	@RequestMapping("/saveappointment")
	public ModelAndView saveAppoint(@ModelAttribute("appointment") AppointmentBooking booking) {
		Doctor leadDoctor = new Doctor();
		Patient patient = new Patient();
		booking.setLeadDoctor(leadDoctor);
		booking.setPatient(patient);
		appointmentService.addBooking(booking);
		ModelAndView mv = new ModelAndView("appointsave");
		return mv;
	}

	@RequestMapping("/adminhomeb")
	public String adminHomeB() {
		return "adminpage";
	}

	/*
	 * @RequestMapping("/appointlist") public ModelAndView viewAllAppoint() {
	 * List<AppointmentBooking> bookings = appointmentService.findAllBookings();
	 * ModelAndView mv = new ModelAndView("appointlist"); mv.addObject("alist",
	 * bookings); return mv; }
	 */

}
