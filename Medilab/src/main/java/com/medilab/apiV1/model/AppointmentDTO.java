package com.medilab.apiV1.model;

import lombok.Data;

@Data
public class AppointmentDTO {

	private Long id;
	private String name;
	private String email;
	private String phone;
	private String message;
	private String date;
	private String department;
	private String doctor;
	
}
