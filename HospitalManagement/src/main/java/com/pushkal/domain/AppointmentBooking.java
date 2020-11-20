package com.pushkal.domain;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AppointmentBooking {
	@Id

	private String ap_id;
	private Date date;
	private String time;
	private String fees;
	private String diagnosis;
	private String treatment;

	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Doctor doctor;

	public AppointmentBooking(String ap_id, Date date, String time, String fees, String diagnosis, String treatment,
			Patient patient, Doctor doctor) {
		super();
		this.ap_id = ap_id;
		this.date = date;
		this.time = time;
		this.fees = fees;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.patient = patient;
		this.doctor = doctor;
	}

	public AppointmentBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAp_id() {
		return ap_id;
	}

	public void setAp_id(String ap_id) {
		this.ap_id = ap_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "AppointmentBooking [ap_id=" + ap_id + ", date=" + date + ", time=" + time + ", fees=" + fees
				+ ", diagnosis=" + diagnosis + ", treatment=" + treatment + ", patient=" + patient + ", doctor="
				+ doctor + "]";
	}

}
