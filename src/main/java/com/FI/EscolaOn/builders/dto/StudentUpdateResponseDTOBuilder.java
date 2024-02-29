package com.FI.EscolaOn.builders.dto;

import com.FI.EscolaOn.dto.response.AddressRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.StudentUpdateResponseDTO;
import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.enums.RoleName;

public class StudentUpdateResponseDTOBuilder {
	private StudentUpdateResponseDTO entity;

    private StudentUpdateResponseDTOBuilder(){
        this.entity = new StudentUpdateResponseDTO();
    }

    public static StudentUpdateResponseDTOBuilder builder(){
        return new StudentUpdateResponseDTOBuilder();
    }

    public StudentUpdateResponseDTO build(){
        return this.entity;
    }

    public StudentUpdateResponseDTOBuilder id(Long id){
        this.entity.setId(id);
        return this;
    }

    public StudentUpdateResponseDTOBuilder name(String name){
        this.entity.setName(name);
        return this;
    }

    public StudentUpdateResponseDTOBuilder email(String email){
        this.entity.setEmail(email);
        return this;
    }

    public StudentUpdateResponseDTOBuilder cpf(String cpf){
        this.entity.setCpf(cpf);
        return this;
    }

    public StudentUpdateResponseDTOBuilder roleName(RoleName role){
        this.entity.setRole(role);
        return this;
    }

    public StudentUpdateResponseDTOBuilder address(Address address) {
        this.entity.setAddress(new AddressRegisterResponseDTO(address));
        return this;
    }
}
