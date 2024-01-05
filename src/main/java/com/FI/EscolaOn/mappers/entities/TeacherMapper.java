package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.TeacherRegisterResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.TeacherBuilder;
import com.FI.EscolaOn.dto.request.TeacherRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.TeacherRegisterResponseDTO;
import com.FI.EscolaOn.entity.Teacher;
import com.FI.EscolaOn.enums.RoleName;

public class TeacherMapper {

	public static Teacher fromTeacherRegisterRequest(TeacherRegisterRequestDTO request) {
		return TeacherBuilder.builder()
                .name(request.getName())
                .password(request.getPassword())
                .roleName(RoleName.valueOf(request.getRole().toString()))
                .cpf(request.getCpf())
                .address(AddressMapper.fromAddressRegisterRequest(request.getAddress()))
                .build();
	}

	public static TeacherRegisterResponseDTO fromTeacher(Teacher entity) {
		return TeacherRegisterResponseDTOBuilder.builder()
                .id(entity.getId())
                .name(entity.getName())
                .roleName(entity.getRole())
                .cpf(entity.getCpf())
                .address(entity.getAddress())
                .build();
	}

}
