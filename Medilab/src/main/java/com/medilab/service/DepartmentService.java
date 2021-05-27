package com.medilab.service;

import com.medilab.apiV1.model.DepartmentListDTO;
import com.medilab.apiV1.model.DepartmentsDTO;

public interface DepartmentService {
DepartmentListDTO getAllDepartments();

DepartmentsDTO getDepartmentByName (String name) ;
}
