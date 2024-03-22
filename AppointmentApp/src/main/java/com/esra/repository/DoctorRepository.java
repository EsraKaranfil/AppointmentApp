package com.esra.repository;

import com.esra.entity.Doctor;
import com.esra.utility.enums.EMedicalSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    List<Doctor> findByMedicalSpecialty(EMedicalSpecialty medicalSpecialty);
    List<Doctor> findByHospitalId(Long hospitalId);
    List<Doctor> findByHospitalIdAndMedicalSpecialty(Long hospitalId, EMedicalSpecialty medicalSpecialty);


}
