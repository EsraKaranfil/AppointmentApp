package com.esra.dto.request;

import com.esra.utility.enums.EMedicalSpecialty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorCreateRequestDto {

    private String name;
    private String surname;
    private String tc;
    private Long hospitalId;
    private EMedicalSpecialty medicalSpecialty;

}
