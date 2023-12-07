package com.FI.EscolaOn.dto.request;

public class StudentRegisterRequestDTO {
	private String name;
    private String password;
    private String email;
    private String cpf;
    private String role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public AddressRegisterRequestDTO getAddress() {
		return address;
	}
	public void setAddress(AddressRegisterRequestDTO address) {
		this.address = address;
	}
    
    
}
