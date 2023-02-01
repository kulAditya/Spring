package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService pserv;

	
	@PostMapping("/savePatient")
	public Patient SavePatient(@RequestBody Patient p)
	{
		return pserv.SavePatient(p);
	}
}
