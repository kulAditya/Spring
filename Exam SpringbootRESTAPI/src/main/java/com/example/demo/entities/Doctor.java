package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	int doctor_id;
	
	@Column
	String name;
	
	@Column
	String degree;
	
	@Column
	String specialization;
	
	@Column
	int experience;
	
	@OneToMany
	@JsonIgnoreProperties("Doctor")
	
	Set<Patient> patients;
	
	public Doctor() {
		
	}


	public Doctor(int doctor_id, String name, String degree, String specialization, int experience) {
		super();
		this.doctor_id = doctor_id;
		this.name = name;
		this.degree = degree;
		this.specialization = specialization;
		this.experience = experience;
	}


	public int getDoctor_id() {
		return doctor_id;
	}


	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}

	
	
}
