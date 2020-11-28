package com.pushkal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.pushkal.domain.Doctor;
import com.pushkal.domain.Receptionist;
import com.pushkal.service.DoctorService;

import com.pushkal.service.ReceptionistService;

@Controller
@SessionAttributes(names = { "username", "email" ,"doc_id" }) // shared
public class UserController {
	@Autowired
	private ReceptionistService receptionService;
	@Autowired
	private DoctorService doctorService;

	@RequestMapping("/verifyuser")
	public ModelAndView verifyUser(@RequestParam("email") String email, @RequestParam("password") String password,
			@RequestParam("utype") String utype) {

		if (utype.equals("Admin")) {
			if (email.equalsIgnoreCase("admin@gmail.com") && password.equalsIgnoreCase("admin")) {
				ModelAndView mv = new ModelAndView();
				mv.setViewName("adminpage");
				mv.addObject("email", email);
				return mv;
			} else {
				ModelAndView mv = new ModelAndView("invaliduser");
				return mv;
			}
		} else if (utype.equalsIgnoreCase("receptionist")) {
			Receptionist rec = new Receptionist();
			rec.setEmail(email);
			rec.setPassword(password);
			Receptionist recep = receptionService.verifyReceptiont(rec);
			// System.out.println(recep);
			if (recep != null) {
				ModelAndView mv = new ModelAndView();
				mv.setViewName("receptionpage");
				mv.addObject("email", email);
				mv.addObject("username", recep.getRname());
				return mv;
			} else {
				ModelAndView mv = new ModelAndView("invaliduser");
				return mv;
			}
		} else {
			Doctor doc = new Doctor();
			doc.setEmail(email);
			doc.setPassword(password);
			Doctor d = doctorService.verifyUserDoctor(doc);
			if (d != null) {
				ModelAndView mv = new ModelAndView("doctorpage");
				mv.addObject("email", email);
				mv.addObject("username", d.getDname());
				mv.addObject("doc_id", d.getDoc_id());
				
				return mv;
			} else {
				ModelAndView mv = new ModelAndView("invaliduser");
				return mv;
			}

		}
	}

}