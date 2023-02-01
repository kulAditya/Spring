package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Doctor;
import com.example.demo.repositories.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	DoctorRepository docrepo;
	
	
	public List<Doctor> getAll(int exp,String spe)
	{
		return docrepo.getAll(exp,spe);
	}
	
	
}
