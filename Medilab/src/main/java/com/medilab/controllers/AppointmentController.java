package com.medilab.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.apiV1.model.AppointmentDTO;
import com.medilab.service.AppointmentService;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {

	private final AppointmentService appointmentService;

	public AppointmentController(AppointmentService appointmentService) {
		this.appointmentService = appointmentService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AppointmentDTO sendAppointment (@ModelAttribute AppointmentDTO appointmentDTO) {
		return appointmentService.saveAppoinment(appointmentDTO);
	}
	
	
}
