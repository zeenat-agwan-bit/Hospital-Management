package com.pushkal.domain;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger did;
	private String email;
	private String password;
	private String dname;
	private String phone;
	private String city;
	private String address;
	private String state;
	private String qualification;
	private String gender;
	private String specialization;

	@OneToMany(mappedBy = "doctor") // no extra field created due to mapped by
	private List<Patient> patients;

	@OneToMany(mappedBy = "leadDoctor")
	private List<AppointmentBooking> bookings;

	public BigInteger getDid() {
		return did;
	}

	public void setDid(BigInteger did) {
		this.did = did;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<AppointmentBooking> getBookings() {
		return bookings;
	}

	public void setBookings(List<AppointmentBooking> bookings) {
		this.bookings = bookings;
	}

	public Doctor(BigInteger did, String email, String password, String dname, String phone, String city,
			String address, String state, String qualification, String gender, String specialization,
			List<Patient> patients, List<AppointmentBooking> bookings) {
		super();
		this.did = did;
		this.email = email;
		this.password = password;
		this.dname = dname;
		this.phone = phone;
		this.city = city;
		this.address = address;
		this.state = state;
		this.qualification = qualification;
		this.gender = gender;
		this.specialization = specialization;
		this.patients = patients;
		this.bookings = bookings;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", email=" + email + ", password=" + password + ", dname=" + dname + ", phone="
				+ phone + ", city=" + city + ", address=" + address + ", state=" + state + ", qualification="
				+ qualification + ", gender=" + gender + ", specialization=" + specialization + ", patients=" + patients
				+ ", bookings=" + bookings + "]";
	}

	
}
