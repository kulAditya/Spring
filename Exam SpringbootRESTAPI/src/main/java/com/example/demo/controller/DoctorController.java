package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	DoctorService docserv;
	
	public DoctorController() {
		
	}
	
	@GetMapping("/getDoctors")
	public List<Doctor> GetAll(@RequestParam("experience")int exp, @RequestParam("specialization") String spe)
	{
		return docserv.getAll(exp,spe);
	}
	
	
}
