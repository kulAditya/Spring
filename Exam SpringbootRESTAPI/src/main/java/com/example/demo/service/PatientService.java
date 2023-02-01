package com.example.demo.service;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository prepo;
	
	public PatientService() 
	{
			
	}
	
	
	public Patient SavePatient(Patient p)
	{
		
		return prepo.save(p);
	}

}
