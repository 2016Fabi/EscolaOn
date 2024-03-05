package com.FI.EscolaOn.dto.response;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.FI.EscolaOn.entity.Course;
import com.FI.EscolaOn.entity.Student;
import com.FI.EscolaOn.enums.RoleName;

public class StudentResponseDTO {
	private Long id;
	private String name;
	private String email;
	private String cpf;
	private RoleName roleName;
	private Instant createdAt = Instant.now();
	private AddressResponseDTO address;
	private List<Course> courses = new ArrayList<>();

	public StudentResponseDTO() {

	}

	public StudentResponseDTO(Student entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.cpf = entity.getCpf();
		this.roleName = entity.getRoleName();
		this.createdAt = entity.getCreatedAt();
		this.address = new AddressResponseDTO(entity.getAddress());
		this.courses = entity.getCourses();
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

	public AddressResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseDTO address) {
		this.address = address;
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

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
