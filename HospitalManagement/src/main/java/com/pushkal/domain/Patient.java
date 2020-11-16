package com.pushkal.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;

@Entity
public class Patient {
	@Id
	@Email(message = "Invalid Email Address")
	private String email;
	private String password;
	private String pName;
	private int phone;
	private int age;
	private String gender;
	private String blood;
	private String address;
	private String city;
	private String state;
	@ManyToOne
	private Doctor doctor;

	@ManyToOne
	private Receptionist receptionist;

	@OneToMany
	private List<AppointmentBooking> bookings;
	
	
	public List<AppointmentBooking> getBookings() {
		return bookings;
	}

	public void setBookings(List<AppointmentBooking> bookings) {
		this.bookings = bookings;
	}

	public Patient(String email, String password, String pName, int phone, int age, String gender, String blood,
			String address, String city, String state, Doctor doctor, Receptionist receptionist,
			List<AppointmentBooking> bookings) {
		super();
		this.email = email;
		this.password = password;
		this.pName = pName;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		this.address = address;
		this.city = city;
		this.state = state;
		this.doctor = doctor;
		this.receptionist = receptionist;
		this.bookings = bookings;
	}

	public Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient() {
		super();

	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Patient(String email, String password, String pName, int phone, int age, String gender, String blood,
			String address, String city, String state) {
		super();
		this.email = email;
		this.password = password;
		this.pName = pName;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		this.address = address;
		this.city = city;
		this.state = state;

	}

	public Patient(String email, String password, String pName, int phone, int age, String gender, String blood,
			String address, String city, String state, Doctor doctor) {
		super();
		this.email = email;
		this.password = password;
		this.pName = pName;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		this.address = address;
		this.city = city;
		this.state = state;
		this.doctor = doctor;
	}

	public Patient(String email, String password, String pName, int phone, int age, String gender, String blood,
			String address, String city, String state, Receptionist receptionist) {
		super();
		this.email = email;
		this.password = password;
		this.pName = pName;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		this.address = address;
		this.city = city;
		this.state = state;
		this.receptionist = receptionist;
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

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [email=" + email + ", password=" + password + ", pName=" + pName + ", phone=" + phone + ", age="
				+ age + ", gender=" + gender + ", blood=" + blood + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", doctor=" + doctor + ", receptionist=" + receptionist + ", bookings="
				+ bookings + "]";
	}

}
