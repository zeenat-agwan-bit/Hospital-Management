package com.pushkal.domain;

import java.sql.Time;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class AppointmentBooking {
	@Id
	@SequenceGenerator(name = "apid_generator", sequenceName = "apid_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "apid_generator")

	private int ap_id;
	//@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Basic
	private Date date;
	//@Temporal(TemporalType.TIME)
	@Basic
	private Time time;
	private int fees;
	private String description;
	private String cnp;
	
	

	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Doctor doctor;

	public AppointmentBooking(int ap_id, Date date, Time time, int fees, String description, String cnp,
			Patient patient, Doctor doctor) {
		super();
		this.ap_id = ap_id;
		this.date = date;
		this.time = time;
		this.fees = fees;
		this.description = description;
		this.cnp = cnp;
		this.patient = patient;
		this.doctor = doctor;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public AppointmentBooking() {
		super();

	}

	public AppointmentBooking(int ap_id, Date date, Time time, int fees, String description, String cnp,
			Patient patient) {
		super();
		this.ap_id = ap_id;
		this.date = date;
		this.time = time;
		this.fees = fees;
		this.description = description;
		this.cnp = cnp;
		this.patient = patient;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public AppointmentBooking(int ap_id, Date date, Time time, int fees, String description, String cnp) {
		super();
		this.ap_id = ap_id;
		this.date = date;
		this.fees = fees;
		this.description = description;
		this.cnp = cnp;
	}

	public int getAp_id() {
		return ap_id;
	}

	public void setAp_id(int ap_id) {
		this.ap_id = ap_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	@Override
	public String toString() {
		return "AppointmentBooking [ap_id=" + ap_id + ", date=" + date + ", time=" + time + ", fees=" + fees
				+ ", description=" + description + ", cnp=" + cnp + ", patient=" + patient + ", doctor=" + doctor + "]";
	}

}
