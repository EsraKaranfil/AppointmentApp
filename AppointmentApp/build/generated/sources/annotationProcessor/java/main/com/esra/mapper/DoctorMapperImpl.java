package com.esra.mapper;

import com.esra.dto.request.DoctorCreateRequestDto;
import com.esra.entity.Doctor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-22T17:37:05+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.2 (Amazon.com Inc.)"
)
@Component
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public Doctor fromDoctorCreateRequestToDoctor(DoctorCreateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Doctor.DoctorBuilder<?, ?> doctor = Doctor.builder();

        doctor.name( dto.getName() );
        doctor.surname( dto.getSurname() );
        doctor.tc( dto.getTc() );
        doctor.hospitalId( dto.getHospitalId() );
        doctor.medicalSpecialty( dto.getMedicalSpecialty() );

        return doctor.build();
    }
}
