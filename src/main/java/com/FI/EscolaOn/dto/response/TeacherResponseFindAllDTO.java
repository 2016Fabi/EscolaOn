package com.FI.EscolaOn.dto.response;

import java.time.Instant;

import com.FI.EscolaOn.entity.Teacher;
import com.FI.EscolaOn.enums.RoleName;

public class TeacherResponseFindAllDTO {
	
	private Long id;
    private String name;
    private String cpf;
    private RoleName roleName;
    private Instant createdAt = Instant.now();
    private AddressRegisterResponseDTO address;
    
    
    
	public TeacherResponseFindAllDTO(Teacher entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.roleName = entity.getRole();
		this.createdAt = entity.getCreatedAt();
        this.address = new AddressRegisterResponseDTO(entity.getAddress());
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public RoleName getRoleName() {
		return roleName;
	}
	
	public void setRoleName(RoleName roleName) {
		this.roleName = roleName;
	}
	
	public Instant getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
	
	public AddressRegisterResponseDTO getAddress() {
		return address;
	}
	
	public void setAddress(AddressRegisterResponseDTO address) {
		this.address = address;
	}
    
    
}
