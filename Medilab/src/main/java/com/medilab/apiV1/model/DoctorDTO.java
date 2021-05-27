package com.medilab.apiV1.model;



import lombok.Data;


@Data 
public class DoctorDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private String speciality;
	private Byte[] image;
}
