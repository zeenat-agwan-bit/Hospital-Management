/*
 * package com.pushkal.controller; import
 * org.springframework.stereotype.Controller;
 * 
 * @Controller public class BookingController { // bookind and patient mapping
 * 
 * 
 * @Autowired private AppointmentService appointmentService;
 * 
 * @Autowired private DoctorService doctorService;
 * 
 * @Autowired private PatientService patientService;
 * 
 * 
 * //for appointment(admin)
 * 
 * @RequestMapping("appointentry") public ModelAndView
 * showAppointEntryForm(@SessionAttribute("email") String email) { ModelAndView
 * mv = new ModelAndView("appointentry"); mv.addObject("booking", new
 * AppointmentBooking()); List<String> emails =
 * patientService.findAllPEmails(email);
 * 
 * mv.addObject("emails", emails); return mv; }
 * 
 * 
 * 
 * @RequestMapping("/saveappointment") public ModelAndView
 * saveAppoint(@ModelAttribute("appointment") AppointmentBooking booking) {
 * appointmentService.addBooking(booking); ModelAndView mv = new
 * ModelAndView("appointsave"); return mv; }
 * 
 * @RequestMapping("/appointlist") public ModelAndView viewAllAppoint() {
 * List<AppointmentBooking> bookings = appointmentService.findAllBookings();
 * ModelAndView mv = new ModelAndView("appointlist"); mv.addObject("alist",
 * bookings); return mv; }
 * 
 * @RequestMapping("/adminhomeb") public String adminHomeB() { return
 * "adminpage"; }
 * 
 * 
 * }
 */