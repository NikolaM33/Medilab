package com.medilab.apiV1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.medilab.apiV1.model.DoctorDTO;
import com.medilab.domain.Doctor;

@Mapper
public interface DoctorMapper {
DoctorMapper INSTANCE= Mappers.getMapper(DoctorMapper.class);
DoctorDTO doctorToDoctorDTO (Doctor doctor);

}
