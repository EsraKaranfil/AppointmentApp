package com.esra.mapper;


import com.esra.dto.request.AppointmentWithPatientRegistrationRequestDto;
import com.esra.dto.request.PatientCreateRequestDto;
import com.esra.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PatientMapper {
    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);


    Patient fromCreateRequestToPatient(final PatientCreateRequestDto dto);

    PatientCreateRequestDto fromAppointmentWithRegistrationToPatientCreateRequest(final AppointmentWithPatientRegistrationRequestDto dto);


}
