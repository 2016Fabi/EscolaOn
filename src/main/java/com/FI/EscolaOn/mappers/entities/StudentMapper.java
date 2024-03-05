package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.response.StudentResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.StudentBuilder;
import com.FI.EscolaOn.dto.request.StudentRequestDTO;
import com.FI.EscolaOn.dto.response.StudentResponseDTO;
import com.FI.EscolaOn.entity.Student;
import com.FI.EscolaOn.enums.RoleName;

public class StudentMapper {
	public static Student fromStudentRegisterRequest(StudentRequestDTO request) {
        return StudentBuilder.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .roleName(RoleName.valueOf(request.getRole().toString()))
                .cpf(request.getCpf())
                .address(AddressMapper.fromAddressRegisterRequest(request.getAddress()))
                .build();
    }

    public static StudentResponseDTO fromStudent(Student entity){
        return StudentResponseDTOBuilder.builder()
                .id(entity.getId())
                .name(entity.getName())
                .roleName(entity.getRoleName())
                .cpf(entity.getCpf())
                .email(entity.getEmail())
                .address(entity.getAddress())
                .build();
    }
}
