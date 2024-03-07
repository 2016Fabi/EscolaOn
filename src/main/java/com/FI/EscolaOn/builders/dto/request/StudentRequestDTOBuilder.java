package com.FI.EscolaOn.builders.dto.request;

import com.FI.EscolaOn.dto.request.AddressRequestDTO;
import com.FI.EscolaOn.dto.request.StudentRequestDTO;
import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.enums.RoleName;

public class StudentRequestDTOBuilder {
	private StudentRequestDTO entity;

    private StudentRequestDTOBuilder(){
        this.entity = new StudentRequestDTO();
    }

    public static StudentRequestDTOBuilder builder(){
        return new StudentRequestDTOBuilder();
    }

    public StudentRequestDTO build(){
        return this.entity;
    }

    public StudentRequestDTOBuilder name(String name){
        this.entity.setName(name);
        return this;
    }

    public StudentRequestDTOBuilder email(String email){
        this.entity.setEmail(email);
        return this;
    }

    public StudentRequestDTOBuilder cpf(String cpf){
        this.entity.setCpf(cpf);
        return this;
    }

    public StudentRequestDTOBuilder roleName(RoleName role){
        this.entity.setRole(role);;
        return this;
    } 

    public StudentRequestDTOBuilder address(Address address) {
        this.entity.setAddress(new AddressRequestDTO(address));
        return this;
    }
}
