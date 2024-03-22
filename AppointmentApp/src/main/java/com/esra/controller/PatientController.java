package com.esra.controller;

import com.esra.dto.request.PatientCreateRequestDto;
import com.esra.entity.Patient;
import com.esra.service.PatientService;
import com.esra.constant.RestApiUrls;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestApiUrls.PATIENT)
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;


    @PostMapping(RestApiUrls.CREATE)
    public ResponseEntity<Patient> createPatient(@RequestBody PatientCreateRequestDto dto){
        return ResponseEntity.ok(patientService.createPatient(dto));
    }

}
