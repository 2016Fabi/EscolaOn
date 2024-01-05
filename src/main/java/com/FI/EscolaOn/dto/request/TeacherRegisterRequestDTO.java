package com.FI.EscolaOn.dto.request;

import com.FI.EscolaOn.enums.RoleName;

public class TeacherRegisterRequestDTO {
	
	private String name;
	private String password;
	private String cpf;
	private RoleName role;
	private AddressRegisterRequestDTO address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
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
	
	public AddressRegisterRequestDTO getAddress() {
		return address;
	}
	
	public void setAddress(AddressRegisterRequestDTO address) {
		this.address = address;
	}
	
}
