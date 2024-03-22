package com.esra.controller;

import com.esra.dto.request.DoctorCreateRequestDto;
import com.esra.dto.request.HospitalCreateRequestDto;
import com.esra.entity.Doctor;
import com.esra.entity.Hospital;
import com.esra.service.HospitalService;
import com.esra.constant.RestApiUrls;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RestApiUrls.HOSPITAL)
@RequiredArgsConstructor
public class HospitalController {

    private final HospitalService hospitalService;

    @PostMapping(RestApiUrls.CREATE)
    public ResponseEntity<Hospital> createHospital(@RequestBody HospitalCreateRequestDto dto){
        return ResponseEntity.ok(hospitalService.createHospital(dto));
    }

    @PostMapping(value = RestApiUrls.CREATE_DOCTOR, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Doctor> createDoctor(@RequestBody @ModelAttribute DoctorCreateRequestDto dto){
        return ResponseEntity.ok(hospitalService.createDoctor(dto));
    }

    @GetMapping(RestApiUrls.FIND_ALL)
    public ResponseEntity<List<Hospital>> findAll(){
        return ResponseEntity.ok(hospitalService.findAll());
    }

    @GetMapping(RestApiUrls.FIND_ALL_BY_CITY)
    public ResponseEntity<List<Hospital>> findAllByCity(@RequestParam String city){
        return ResponseEntity.ok(hospitalService.findAllByCity(city));
    }
}
