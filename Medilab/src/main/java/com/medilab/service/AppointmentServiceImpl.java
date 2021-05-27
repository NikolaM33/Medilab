package com.medilab.service;

import org.springframework.stereotype.Service;

import com.medilab.apiV1.mapper.AppointmentMapper;
import com.medilab.apiV1.model.AppointmentDTO;
import com.medilab.domain.Appointment;
import com.medilab.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	private final AppointmentMapper appointmentMapper;
	private final AppointmentRepository appointmentRepository;
	
	

	public AppointmentServiceImpl(AppointmentMapper appointmentMapper, AppointmentRepository appointmentRepository) {
		this.appointmentMapper = appointmentMapper;
		this.appointmentRepository = appointmentRepository;
	}



	@Override
	public AppointmentDTO saveAppoinment(AppointmentDTO appointmentDTO) {
		Appointment appointment=appointmentMapper.appointmentDTOToAppointmnet(appointmentDTO);
		Appointment savedAppointment=appointmentRepository.save(appointment);
			
		return appointmentMapper.appointmentToAppointmentDTO(savedAppointment);
		
	}
	

}
