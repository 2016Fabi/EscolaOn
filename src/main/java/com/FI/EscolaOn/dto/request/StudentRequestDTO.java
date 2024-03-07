package com.FI.EscolaOn.dto.request;

import com.FI.EscolaOn.entity.Student;
import com.FI.EscolaOn.enums.RoleName;

public class StudentRequestDTO {
	private String name;
    private String password;
    private String email;
    private String cpf;
    private RoleName roleName;
    private AddressRequestDTO address;
    
	public StudentRequestDTO() {
		
	}
	
	public StudentRequestDTO(Student entity) {
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.cpf = entity.getCpf();
		this.roleName = entity.getRoleName();
		this.address = new AddressRequestDTO(entity.getAddress());
	}



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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public RoleName getRole() {
		return roleName;
	}

	public void setRole(RoleName role) {
		this.roleName = role;
	}

	public AddressRequestDTO getAddress() {
		return address;
	}

	public void setAddress(AddressRequestDTO address) {
		this.address = address;
	}
	
}
