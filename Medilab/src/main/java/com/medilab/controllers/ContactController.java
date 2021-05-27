package com.medilab.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.apiV1.model.ContactDTO;
import com.medilab.service.ContactService;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

	private final ContactService contactService;

	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ContactDTO saveContact (@ModelAttribute ContactDTO contactDTO) {
		return contactService.saveContact(contactDTO);
		
	}
	
}
