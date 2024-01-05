package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.StudentRegisterResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.StudentBuilder;
import com.FI.EscolaOn.dto.request.StudentRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.StudentRegisterResponseDTO;
import com.FI.EscolaOn.entity.Student;
import com.FI.EscolaOn.enums.RoleName;

public class StudentMapper {
	public static Student fromStudentRegisterRequest(StudentRegisterRequestDTO request) {
        return StudentBuilder.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .roleName(RoleName.valueOf(request.getRole().toString()))
                .cpf(request.getCpf())
                .address(AddressMapper.fromAddressRegisterRequest(request.getAddress()))
                .build();
    }

    public static StudentRegisterResponseDTO fromStudent(Student entity){
        return StudentRegisterResponseDTOBuilder.builder()
                .id(entity.getId())
                .name(entity.getName())
                .roleName(entity.getRoleName())
                .cpf(entity.getCpf())
                .email(entity.getEmail())
                .address(entity.getAddress())
                .build();
    }
}
