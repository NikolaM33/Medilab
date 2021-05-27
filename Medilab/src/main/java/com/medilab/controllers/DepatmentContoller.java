package com.medilab.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.apiV1.model.DepartmentListDTO;
import com.medilab.apiV1.model.DepartmentsDTO;
import com.medilab.service.DepartmentService;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/departments")
public class DepatmentContoller {

	private final DepartmentService departmentService;

	public DepatmentContoller(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public DepartmentListDTO getAllDepartments () {
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("{name}")
	@ResponseStatus(HttpStatus.OK)
	public DepartmentsDTO getDepartmentByName (@PathVariable String name) {
		return departmentService.getDepartmentByName(name);
	}
	
}
