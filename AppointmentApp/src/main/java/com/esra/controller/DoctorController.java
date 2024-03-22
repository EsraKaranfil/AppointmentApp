package com.esra.controller;


import com.esra.entity.Doctor;
import com.esra.service.DoctorService;
import com.esra.utility.enums.EMedicalSpecialty;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.esra.constant.RestApiUrls.*;

@RestController
@RequestMapping(DOCTOR)
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping(GET_BY_SPECIALITY)
    public ResponseEntity<List<Doctor>> getAllBySpeciality(@RequestParam EMedicalSpecialty specialty){
        return ResponseEntity.ok(doctorService.getAllBySpeciality(specialty));
    }

    @GetMapping(FIND_ALL_BY_HOSPITAL)
    public ResponseEntity<List<Doctor>> findAllByHospital(@RequestParam Long hospitalId){
        return ResponseEntity.ok(doctorService.findAllByHospital(hospitalId));
    }

    @GetMapping(FIND_ALL_BY_HOSPITAL_AND_SPECIALITY)
    public ResponseEntity<List<Doctor>> findByHospitalIdAndMedicalSpecialty(Long hospitalId,EMedicalSpecialty medicalSpecialty){
        return ResponseEntity.ok(doctorService.findByHospitalIdAndMedicalSpecialty(hospitalId,medicalSpecialty));
    }

}
