package com.FI.EscolaOn.dto.response;

import com.FI.EscolaOn.enums.CourseName;

public class CourseRegisterResponseDTO {
	
	private Long id;
	private CourseName course;
	private String description;
	private int timeCourse;
	private AddressRegisterResponseDTO address;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public CourseName getCourse() {
		return course;
	}
	
	public void setCourse(CourseName course) {
		this.course = course;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getTimeCourse() {
		return timeCourse;
	}
	
	public void setTimeCourse(int timeCourse) {
		this.timeCourse = timeCourse;
	}

	public AddressRegisterResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressRegisterResponseDTO address) {
		this.address = address;
	}
	
	

}
