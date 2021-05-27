package com.medilab.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.apiV1.model.DoctorDTO;

import com.medilab.service.DoctorService;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

	private final DoctorService doctorService;

	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	@CrossOrigin
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<DoctorDTO> getAllDoctors () {
		return doctorService.getAllDoctors();
	}
}
