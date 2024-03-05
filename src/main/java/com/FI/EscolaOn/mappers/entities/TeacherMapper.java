package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.TeacherResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.TeacherBuilder;
import com.FI.EscolaOn.dto.request.TeacherRequestDTO;
import com.FI.EscolaOn.dto.response.TeacherResponseDTO;
import com.FI.EscolaOn.entity.Teacher;
import com.FI.EscolaOn.enums.RoleName;

public class TeacherMapper {

	public static Teacher fromTeacherRegisterRequest(TeacherRequestDTO request) {
		return TeacherBuilder.builder()
                .name(request.getName())
                .password(request.getPassword())
                .roleName(RoleName.valueOf(request.getRole().toString()))
                .cpf(request.getCpf())
                .address(AddressMapper.fromAddressRegisterRequest(request.getAddress()))
                .build();
	}

	public static TeacherResponseDTO fromTeacher(Teacher entity) {
		return TeacherResponseDTOBuilder.builder()
                .id(entity.getId())
                .name(entity.getName())
                .roleName(entity.getRole())
                .cpf(entity.getCpf())
                .address(entity.getAddress())
                .build();
	}

}
