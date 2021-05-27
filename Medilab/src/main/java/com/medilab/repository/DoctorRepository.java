package com.medilab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.domain.Doctor;


public interface DoctorRepository extends  JpaRepository<Doctor, Long>{

}
