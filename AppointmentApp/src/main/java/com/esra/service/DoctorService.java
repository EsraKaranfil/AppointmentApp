package com.esra.service;

import com.esra.entity.Doctor;
import com.esra.repository.DoctorRepository;
import com.esra.utility.ServiceManager;
import com.esra.utility.enums.EMedicalSpecialty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService extends ServiceManager<Doctor,Long> {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        super(doctorRepository);
        this.doctorRepository = doctorRepository;
    }


    public List<Doctor> getAllBySpeciality(EMedicalSpecialty specialty) {
        return doctorRepository.findByMedicalSpecialty(specialty);
    }

    public List<Doctor> findAllByHospital(Long hospitalId) {
        return doctorRepository.findByHospitalId(hospitalId);
    }

    public List<Doctor> findByHospitalIdAndMedicalSpecialty(Long hospitalId,EMedicalSpecialty medicalSpecialty){
        return doctorRepository.findByHospitalIdAndMedicalSpecialty(hospitalId,medicalSpecialty);
    }


}
