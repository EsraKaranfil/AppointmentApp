package com.esra.mapper;

import com.esra.dto.request.HospitalCreateRequestDto;
import com.esra.entity.Hospital;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-22T17:37:05+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.2 (Amazon.com Inc.)"
)
@Component
public class HospitalMapperImpl implements HospitalMapper {

    @Override
    public Hospital fromHospitalCreateRequestToHospital(HospitalCreateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Hospital.HospitalBuilder<?, ?> hospital = Hospital.builder();

        hospital.name( dto.getName() );
        hospital.city( dto.getCity() );

        return hospital.build();
    }
}
