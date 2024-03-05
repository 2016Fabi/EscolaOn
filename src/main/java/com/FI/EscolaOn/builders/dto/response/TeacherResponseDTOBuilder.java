package com.FI.EscolaOn.builders.dto.response;

import com.FI.EscolaOn.dto.response.AddressResponseDTO;
import com.FI.EscolaOn.dto.response.TeacherResponseDTO;
import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.enums.RoleName;

public class TeacherResponseDTOBuilder {
	private TeacherResponseDTO entity;
	
	private TeacherResponseDTOBuilder() {
		this.entity = new TeacherResponseDTO();
	}
	
	public static TeacherResponseDTOBuilder builder() {
		return new TeacherResponseDTOBuilder();
	}

	public TeacherResponseDTO build() {
		return this.entity;
	}

	public TeacherResponseDTOBuilder id(Long id) {
		this.entity.setId(id);
		return this;
	}

	public TeacherResponseDTOBuilder name(String name) {
		this.entity.setName(name);
		return this;
	}

	public TeacherResponseDTOBuilder cpf(String cpf) {
		this.entity.setCpf(cpf);
		return this;
	}

	public TeacherResponseDTOBuilder roleName(RoleName role) {
		this.entity.setRoleName(role);
		return this;
	}

	public TeacherResponseDTOBuilder address(Address address) {
		this.entity.setAddress(new AddressResponseDTO(address));
		return this;
	}

}
