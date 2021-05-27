package com.medilab.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.apiV1.model.FAQListDTO;
import com.medilab.service.FAQService;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/faq")
public class FAQController {

	private final FAQService faqService;

	public FAQController(FAQService faqService) {
		this.faqService = faqService;
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public FAQListDTO getAllFaq () {
		return faqService.getAllFAQ();
	}
}
