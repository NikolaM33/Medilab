package com.medilab.apiV1.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DepartmentListDTO {

	List<DepartmentsDTO> departments;
}
