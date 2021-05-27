package com.medilab.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medilab.apiV1.mapper.DoctorMapper;
import com.medilab.apiV1.model.DoctorDTO;
import com.medilab.domain.Doctor;
import com.medilab.repository.DoctorRepository;

@Service
public class DoctorServiceImpl  implements DoctorService{
	
	@Autowired
	private final DoctorMapper doctorMapper;
	private final DoctorRepository doctorRepository;
	
	

	public DoctorServiceImpl(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
		this.doctorRepository = doctorRepository;
		this.doctorMapper = doctorMapper;
	}



	@Override
	public List<DoctorDTO> getAllDoctors() {
		List<Doctor> doctors= doctorRepository.findAll();
             
		System.out.println(doctors);
		
		return doctorRepository.findAll().stream().map(doctor->{
			DoctorDTO doctorDTO= doctorMapper.doctorToDoctorDTO(doctor);
			return doctorDTO;
		}).collect(Collectors.toList());
               
		
    }
		/* List<DoctorDTO> doctorDTOS =doctorRepository.findAll().stream()
				.map(doctor->{
					DoctorDTO doctorDTO= doctorMapper.doctorToDoctorDTO(doctor);
					return doctorDTO;
				}).collect(Collectors.toList());
		return new DoctorListDTO(doctorDTOS);
		*/
	}


