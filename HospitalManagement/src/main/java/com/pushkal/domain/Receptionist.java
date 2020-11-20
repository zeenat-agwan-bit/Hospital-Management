package com.pushkal.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;

@Entity
public class Receptionist {
	@Id
	@Email(message = "Invalid Email Address")
	private String email;
	private String password;
	private String rname;
	private String phone;
	private String city;
	private String address;
	private String state;
	private String gender;

	@OneToMany(mappedBy = "receptionist", fetch = FetchType.EAGER)
	private List<Patient> patient;

	
	
	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
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

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Receptionist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receptionist(String email, String password, String rname, String phone, String city, String address,
			String state, String gender) {
		super();
		this.email = email;
		this.password = password;
		this.rname = rname;
		this.phone = phone;
		this.city = city;
		this.address = address;
		this.state = state;
		this.gender = gender;

	}

	
	
	public Receptionist(String email, String password, String rname, String phone, String city, String address,
			String state, String gender, List<Patient> patient) {
		super();
		this.email = email;
		this.password = password;
		this.rname = rname;
		this.phone = phone;
		this.city = city;
		this.address = address;
		this.state = state;
		this.gender = gender;
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Receptionist [email=" + email + ", password=" + password + ", rname=" + rname + ", phone=" + phone
				+ ", city=" + city + ", address=" + address + ", state=" + state + ", gender=" + gender + ", patient="
				+ patient + "]";
	}

}
