package com.pushkal.domain;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class AppointmentBooking {
	@Id
	@SequenceGenerator(name = "aid_generator", sequenceName = "aid_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aid_generator")
	
	private BigInteger ap_id;
	private Date date;
	private String time;
	private String fees;
	private String diagnosis;
	private String treatment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Patient patient;
	
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Doctor leadDoctor;

	public AppointmentBooking(BigInteger ap_id, Date date, String time, String fees, String diagnosis, String treatment,
			Patient patient, Doctor leadDoctor) {
		super();
		this.ap_id = ap_id;
		this.date = date;
		this.time = time;
		this.fees = fees;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.patient = patient;
		this.leadDoctor = leadDoctor;
	}

	public AppointmentBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigInteger getAp_id() {
		return ap_id;
	}

	public void setAp_id(BigInteger ap_id) {
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

	public Doctor getLeadDoctor() {
		return leadDoctor;
	}

	public void setLeadDoctor(Doctor leadDoctor) {
		this.leadDoctor = leadDoctor;
	}

	@Override
	public String toString() {
		return "AppointmentBooking [ap_id=" + ap_id + ", date=" + date + ", time=" + time + ", fees=" + fees
				+ ", diagnosis=" + diagnosis + ", treatment=" + treatment + ", patient=" + patient + ", leadDoctor="
				+ leadDoctor + "]";
	}

	
	

}
