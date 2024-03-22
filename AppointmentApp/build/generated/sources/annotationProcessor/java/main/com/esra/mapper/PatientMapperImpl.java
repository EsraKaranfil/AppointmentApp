package com.esra.mapper;

import com.esra.dto.request.AppointmentWithPatientRegistrationRequestDto;
import com.esra.dto.request.PatientCreateRequestDto;
import com.esra.entity.Patient;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-22T17:37:05+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.2 (Amazon.com Inc.)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public Patient fromCreateRequestToPatient(PatientCreateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Patient.PatientBuilder<?, ?> patient = Patient.builder();

        patient.name( dto.getName() );
        patient.surname( dto.getSurname() );
        patient.tc( dto.getTc() );
        patient.dateOfBirth( dto.getDateOfBirth() );

        return patient.build();
    }

    @Override
    public PatientCreateRequestDto fromAppointmentWithRegistrationToPatientCreateRequest(AppointmentWithPatientRegistrationRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        PatientCreateRequestDto.PatientCreateRequestDtoBuilder patientCreateRequestDto = PatientCreateRequestDto.builder();

        patientCreateRequestDto.name( dto.getName() );
        patientCreateRequestDto.surname( dto.getSurname() );
        patientCreateRequestDto.tc( dto.getTc() );
        patientCreateRequestDto.dateOfBirth( dto.getDateOfBirth() );

        return patientCreateRequestDto.build();
    }
}
