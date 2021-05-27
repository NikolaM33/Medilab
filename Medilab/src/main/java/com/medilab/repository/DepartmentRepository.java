package com.medilab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.domain.Departments;

public interface DepartmentRepository extends JpaRepository<Departments, Long> {
Departments findByName(String name);
}
