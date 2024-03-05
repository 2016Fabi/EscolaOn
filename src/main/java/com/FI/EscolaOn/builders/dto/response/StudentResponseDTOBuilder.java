package com.FI.EscolaOn.builders.dto.response;

import com.FI.EscolaOn.dto.response.AddressResponseDTO;
import com.FI.EscolaOn.dto.response.StudentResponseDTO;
import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.enums.RoleName;

public class StudentResponseDTOBuilder {
	private StudentResponseDTO entity;

    private StudentResponseDTOBuilder(){
        this.entity = new StudentResponseDTO();
    }

    public static StudentResponseDTOBuilder builder(){
        return new StudentResponseDTOBuilder();
    }

    public StudentResponseDTO build(){
        return this.entity;
    }

    public StudentResponseDTOBuilder id(Long id){
        this.entity.setId(id);
        return this;
    }

    public StudentResponseDTOBuilder name(String name){
        this.entity.setName(name);
        return this;
    }

    public StudentResponseDTOBuilder email(String email){
        this.entity.setEmail(email);
        return this;
    }

    public StudentResponseDTOBuilder cpf(String cpf){
        this.entity.setCpf(cpf);
        return this;
    }

    public StudentResponseDTOBuilder roleName(RoleName role){
        this.entity.setRoleName(role);
        return this;
    } 

    public StudentResponseDTOBuilder address(Address address) {
        this.entity.setAddress(new AddressResponseDTO(address));
        return this;
    }
}
