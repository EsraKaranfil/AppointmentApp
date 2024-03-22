package com.esra.service;


import com.esra.dto.request.DoctorCreateRequestDto;
import com.esra.dto.request.HospitalCreateRequestDto;
import com.esra.entity.Doctor;
import com.esra.entity.Hospital;
import com.esra.mapper.DoctorMapper;
import com.esra.mapper.HospitalMapper;
import com.esra.repository.HospitalRepository;
import com.esra.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService extends ServiceManager<Hospital,Long> {

    private final HospitalRepository hospitalRepository;
    private final DoctorService doctorService;

    public HospitalService(HospitalRepository hospitalRepository, DoctorService doctorService) {
        super(hospitalRepository);
        this.hospitalRepository = hospitalRepository;
        this.doctorService = doctorService;
    }

    public Hospital createHospital(HospitalCreateRequestDto dto) {
        return save(HospitalMapper.INSTANCE.fromHospitalCreateRequestToHospital(dto));
    }

    public Doctor createDoctor(DoctorCreateRequestDto dto) {
        return doctorService.save(DoctorMapper.INSTANCE.fromDoctorCreateRequestToDoctor(dto));
    }

    public List<Hospital> findAllByCity(String city){
        return hospitalRepository.findAllByCityIgnoreCase(city);
    }


}
