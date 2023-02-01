package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.hibernate.annotations.ValueGenerationType;

@Entity
@Table(name ="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	
	@Column
	String fname;
	
	@Column
	String lname;
	
	@Column
	String address;
	
	@Column
	String Contact;
	
	@ManyToOne
	@JoinColumn(name="doctor")
	Doctor doctor;
	
	
	public Patient() {
		
	}



	public Patient(int pid, String fname, String lname, String address, String contact, Doctor doctor_id) {
		super();
		this.pid = pid;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		Contact = contact;
		this.doctor = doctor;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getContact() {
		return Contact;
	}



	public void setContact(String contact) {
		Contact = contact;
	}



	public Doctor getDoctor() {
		return doctor;
	}



	public void setDoctor_id(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	

}
