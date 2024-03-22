package com.esra.mapper;


import com.esra.dto.request.DoctorCreateRequestDto;
import com.esra.entity.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    Doctor fromDoctorCreateRequestToDoctor(final DoctorCreateRequestDto dto);


}
