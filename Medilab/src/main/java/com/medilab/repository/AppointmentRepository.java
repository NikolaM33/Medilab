package com.medilab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.domain.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
	

}
