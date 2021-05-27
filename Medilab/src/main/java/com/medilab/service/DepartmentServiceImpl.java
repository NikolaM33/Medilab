package com.medilab.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.medilab.apiV1.mapper.DepartmentsMapper;
import com.medilab.apiV1.model.DepartmentListDTO;
import com.medilab.apiV1.model.DepartmentsDTO;
import com.medilab.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	 private final DepartmentsMapper departmentMapper;
	 private final DepartmentRepository departmentRepository;

	 
	public DepartmentServiceImpl(DepartmentsMapper departmentMapper, DepartmentRepository departmentRepository) {
		this.departmentMapper = departmentMapper;
		this.departmentRepository = departmentRepository;
	}

	@Override
	public DepartmentListDTO getAllDepartments() {
		 List<DepartmentsDTO> departments=departmentRepository.findAll().stream()
				 .map(department->{
					 DepartmentsDTO departmnetDTO=departmentMapper.departmentsToDepartmentDTO(department);
					 return departmnetDTO;
				 }).collect (Collectors.toList());
		return new DepartmentListDTO(departments);
	}

	@Override
	public DepartmentsDTO getDepartmentByName(String name) {
		
		return departmentMapper.departmentsToDepartmentDTO(departmentRepository.findByName(name));
	}

}
