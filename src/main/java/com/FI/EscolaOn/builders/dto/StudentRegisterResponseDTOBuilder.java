package com.FI.EscolaOn.builders.dto;

import com.FI.EscolaOn.dto.response.AddressRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.StudentRegisterResponseDTO;
import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.enums.RoleName;

public class StudentRegisterResponseDTOBuilder {
	private StudentRegisterResponseDTO entity;

    private StudentRegisterResponseDTOBuilder(){
        this.entity = new StudentRegisterResponseDTO();
    }

    public static StudentRegisterResponseDTOBuilder builder(){
        return new StudentRegisterResponseDTOBuilder();
    }

    public StudentRegisterResponseDTO build(){
        return this.entity;
    }

    public StudentRegisterResponseDTOBuilder id(Long id){
        this.entity.setId(id);
        return this;
    }

    public StudentRegisterResponseDTOBuilder name(String name){
        this.entity.setName(name);
        return this;
    }

    public StudentRegisterResponseDTOBuilder email(String email){
        this.entity.setEmail(email);
        return this;
    }

    public StudentRegisterResponseDTOBuilder cpf(String cpf){
        this.entity.setCpf(cpf);
        return this;
    }

    public StudentRegisterResponseDTOBuilder roleName(RoleName role){
        this.entity.setRole(role);
        return this;
    }

    public StudentRegisterResponseDTOBuilder address(Address address) {
        this.entity.setAddress(new AddressRegisterResponseDTO(address));
        return this;
    }
}
