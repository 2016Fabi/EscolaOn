package com.FI.EscolaOn.builders.dto;

import com.FI.EscolaOn.dto.response.AddressRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.TeacherRegisterResponseDTO;
import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.enums.RoleName;

public class TeacherRegisterResponseDTOBuilder {
	private TeacherRegisterResponseDTO entity;
	
	private TeacherRegisterResponseDTOBuilder() {
		this.entity = new TeacherRegisterResponseDTO();
	}
	
	public static TeacherRegisterResponseDTOBuilder builder() {
		return new TeacherRegisterResponseDTOBuilder();
	}

	public TeacherRegisterResponseDTO build() {
		return this.entity;
	}

	public TeacherRegisterResponseDTOBuilder id(Long id) {
		this.entity.setId(id);
		return this;
	}

	public TeacherRegisterResponseDTOBuilder name(String name) {
		this.entity.setName(name);
		return this;
	}

	public TeacherRegisterResponseDTOBuilder cpf(String cpf) {
		this.entity.setCpf(cpf);
		return this;
	}

	public TeacherRegisterResponseDTOBuilder roleName(RoleName role) {
		this.entity.setRole(role);
		return this;
	}

	public TeacherRegisterResponseDTOBuilder address(Address address) {
		this.entity.setAddress(new AddressRegisterResponseDTO(address));
		return this;
	}

}
