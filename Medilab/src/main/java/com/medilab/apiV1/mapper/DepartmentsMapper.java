package com.medilab.apiV1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.medilab.apiV1.model.DepartmentsDTO;
import com.medilab.domain.Departments;



@Mapper
public interface DepartmentsMapper {
 DepartmentsMapper INSTANCE=Mappers.getMapper(DepartmentsMapper.class);
 DepartmentsDTO departmentsToDepartmentDTO (Departments departments);
}
