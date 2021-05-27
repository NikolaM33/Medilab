package com.medilab.service;

//import java.util.Arrays;
//import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.medilab.apiV1.mapper.DoctorMapper;
//import com.medilab.domain.Doctor;
import com.medilab.repository.DoctorRepository;

class DepartmentServiceImplTest {

	@Mock
	DoctorRepository doctorRepository;
	
	DoctorService doctorService;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	public void setUp() throws Exception{
		 MockitoAnnotations.initMocks(this);

		 doctorService=new DoctorServiceImpl(doctorRepository, DoctorMapper.INSTANCE);
	}
	@Test
	void getAllDoctors() throws Exception {
		//List<Doctor> doctors = Arrays.asList();
       // given(doctorRepository.findAll()).willReturn(doctors);

        //when
    //    DoctorListDTO doctorListDTO = doctorService.getAllDoctors();

        //then
     //   then(doctorRepository).should(times(1)).findAll();
     //   assertThat(doctorListDTO.getDoctors().size(), is(equalTo(1)));
	}

}
