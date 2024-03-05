package com.FI.EscolaOn.dto.request;

import com.FI.EscolaOn.enums.CourseName;

public class CourseRequestDTO {
	private CourseName course;
	private String description;
	private int timeCourse;
	private AddressRequestDTO address;
	
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

	public AddressRequestDTO getAddress() {
		return address;
	}

	public void setAddress(AddressRequestDTO address) {
		this.address = address;
	}

	
}
