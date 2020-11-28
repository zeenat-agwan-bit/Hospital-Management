package com.pushkal.domain;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Patient {
	@Id
	@SequenceGenerator(name = "pid_generator", sequenceName = "pid_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pid_generator")
	@Column(name="patient_id")
	private BigInteger patient_id;
	private String pName;
	private String phone;
	private int age;
	private String gender;
	private String blood;
	private String address;
	private String city;
	private String state;
	@ManyToOne(fetch = FetchType.LAZY)
	private Doctor doctor;

	@ManyToOne
	private Receptionist receptionist;

	@OneToMany(mappedBy = "patient", cascade = { CascadeType.ALL }) //for all operations
	private List<AppointmentBooking> bookings;

	public List<AppointmentBooking> getBookings() {
		return bookings;
	}

	public void setBookings(List<AppointmentBooking> bookings) {
		this.bookings = bookings;
	}

	public Patient(BigInteger patient_id, String pName, String phone, int age, String gender, String blood,
			String address, String city, String state, Doctor doctor, Receptionist receptionist,
			List<AppointmentBooking> bookings) {
		super();
		this.patient_id = patient_id;
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

	public Patient(BigInteger patient_id,  String pName, String phone, int age, String gender, String blood,
			String address, String city, String state) {
		super();
		this.patient_id = patient_id;
		this.pName = pName;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		this.address = address;
		this.city = city;
		this.state = state;

	}

	public Patient(BigInteger patient_id, String pName, String phone, int age, String gender, String blood,
			String address, String city, String state, Doctor doctor) {
		super();
		this.patient_id = patient_id;

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

	public Patient(BigInteger patient_id, String pName, String phone, int age, String gender, String blood,
			String address, String city, String state, Receptionist receptionist) {
		super();
		this.patient_id = patient_id;
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

	public BigInteger getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(BigInteger patient_id) {
		this.patient_id = patient_id;
	}

	

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
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
		return "Patient [patient_id=" + patient_id + ", pName=" + pName + ", phone=" + phone
				+ ", age=" + age + ", gender=" + gender + ", blood=" + blood + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", doctor=" + doctor + ", receptionist=" + receptionist + ", bookings="
				+ bookings + "]";
	}

}
