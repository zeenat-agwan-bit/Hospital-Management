package com.pushkal.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;

@Entity
public class Doctor {
	@Id
	@Email(message = "Invalid Email Address")
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
	
	@OneToMany(mappedBy = "doctor" ,fetch = FetchType.EAGER )   // no extra field created due to mapped by
	private List<Patient>patients;
	
	
	@OneToMany(cascade = {CascadeType.ALL})
	private List<AppointmentBooking> bookings;
	
	
	
	public Doctor(String email, String password, String dname, String phone, String city, String address, String state,
			String qualification, String gender, String specialization, List<Patient> patients,
			List<AppointmentBooking> bookings) {
		super();
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

	public List<AppointmentBooking> getBookings() {
		return bookings;
	}

	public void setBookings(List<AppointmentBooking> bookings) {
		this.bookings = bookings;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public Doctor() {
		super();

	}
	
	

	public Doctor(String email, String password, String dname, String phone, String city, String address, String state,
			String qualification, String gender, String specialization, List<Patient> patients) {
		super();
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
	}

	@Override
	public String toString() {
		return "Doctor [email=" + email + ", password=" + password + ", dname=" + dname + ", phone=" + phone + ", city="
				+ city + ", address=" + address + ", state=" + state + ", qualification=" + qualification + ", gender="
				+ gender + ", specialization=" + specialization + ", patients=" + patients + ", bookings=" + bookings
				+ "]";
	}
	

	public Doctor(String email, String password, String dname, String phone, String city, String address, String state,
			String qualification, String gender, String specialization) {
		super();
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
		
	}

	

	public void setQualification(String qualification) {
		this.qualification = qualification;
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

	public void setQulaification(String qualification) {
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

}
