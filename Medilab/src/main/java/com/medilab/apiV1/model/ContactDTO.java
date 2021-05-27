package com.medilab.apiV1.model;

import lombok.Data;

@Data
public class ContactDTO {

	private Long id;
	private String name;
	private String subject;
	private String message;
	private String email;
	
}
