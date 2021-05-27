package com.medilab.apiV1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.medilab.apiV1.model.AppointmentDTO;
import com.medilab.domain.Appointment;

@Mapper
public interface AppointmentMapper {

	AppointmentMapper INSTANCE =Mappers.getMapper(AppointmentMapper.class);
	Appointment appointmentDTOToAppointmnet(AppointmentDTO appointmentDTO);
	AppointmentDTO appointmentToAppointmentDTO (Appointment appointment);
}
