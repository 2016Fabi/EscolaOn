package com.FI.EscolaOn.dto.request;

import com.FI.EscolaOn.enums.CourseName;

public class CourseRegisterRequestDTO {
	private CourseName course;
	private String description;
	private int timeCourse;
	private AddressRegisterRequestDTO address;
	
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

	public AddressRegisterRequestDTO getAddress() {
		return address;
	}

	public void setAddress(AddressRegisterRequestDTO address) {
		this.address = address;
	}

	
}
