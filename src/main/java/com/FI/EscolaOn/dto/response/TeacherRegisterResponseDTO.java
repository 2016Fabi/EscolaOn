package com.FI.EscolaOn.dto.response;

import com.FI.EscolaOn.enums.RoleName;

public class TeacherRegisterResponseDTO {
	
	private Long id;
	private String name;
	private String cpf;
	private RoleName role;
	private AddressRegisterResponseDTO address;
	
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
	public RoleName getRole() {
		return role;
	}
	public void setRole(RoleName role) {
		this.role = role;
	}
	public AddressRegisterResponseDTO getAddress() {
		return address;
	}
	public void setAddress(AddressRegisterResponseDTO address) {
		this.address = address;
	}
	
	
	
}
