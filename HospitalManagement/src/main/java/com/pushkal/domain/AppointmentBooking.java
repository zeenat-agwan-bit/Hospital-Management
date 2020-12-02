package com.pushkal.domain;

import java.math.BigInteger;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class AppointmentBooking {
	@Id
	@SequenceGenerator(name = "acode_generator", sequenceName = "acode_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acode_generator")

	private BigInteger aid;
	private String date;
	private String time;
	private String fees;
	private String diagnosis;
	private String treatment;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinTable(name = "patient_appointment", joinColumns = { @JoinColumn(name = "app_aid") }, inverseJoinColumns = {
			@JoinColumn(name = "patient_pid") })
	private Patient patient;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	/*
	 * @JoinTable(name = "doctor_appointment", joinColumns = { @JoinColumn(name =
	 * "app_aid") }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "doctor_did") })
	 */
	private Doctor doctor;

	public BigInteger getAid() {
		return aid;
	}

	public void setAid(BigInteger aid) {
		this.aid = aid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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

	public AppointmentBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppointmentBooking(BigInteger aid, String date, String time, String fees, String diagnosis, String treatment,
			Patient patient, Doctor doctor) {
		super();
		this.aid = aid;
		this.date = date;
		this.time = time;
		this.fees = fees;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.patient = patient;
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "AppointmentBooking [aid=" + aid + ", date=" + date + ", time=" + time + ", fees=" + fees
				+ ", diagnosis=" + diagnosis + ", treatment=" + treatment + ", patient=" + patient + ", doctor="
				+ doctor + "]";
	}

}