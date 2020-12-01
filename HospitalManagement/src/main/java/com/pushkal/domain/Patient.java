package com.pushkal.domain;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger pid;
	private String pName;
	private String phone;
	private int age;
	private String gender;
	private String blood;
	private String address;
	private String city;
	private String state;
	@ManyToOne(fetch = FetchType.EAGER)
	private Doctor doctor;

	@ManyToOne
	private Receptionist receptionist;

	@OneToMany(mappedBy = "patient", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)

	private List<AppointmentBooking> appointments;

	public BigInteger getPid() {
		return pid;
	}

	public void setPid(BigInteger pid) {
		this.pid = pid;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public List<AppointmentBooking> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<AppointmentBooking> appointments) {
		this.appointments = appointments;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(BigInteger pid, String pName, String phone, int age, String gender, String blood, String address,
			String city, String state, Doctor doctor, Receptionist receptionist,
			List<AppointmentBooking> appointments) {
		super();
		this.pid = pid;
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
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pName=" + pName + ", phone=" + phone + ", age=" + age + ", gender=" + gender
				+ ", blood=" + blood + ", address=" + address + ", city=" + city + ", state=" + state + ", doctor="
				+ doctor + ", receptionist=" + receptionist + ", appointments=" + appointments + "]";
	}

	
}
