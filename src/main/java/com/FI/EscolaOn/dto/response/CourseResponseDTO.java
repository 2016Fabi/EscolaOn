package com.FI.EscolaOn.dto.response;

import java.time.Instant;

import com.FI.EscolaOn.entity.Course;
import com.FI.EscolaOn.enums.CourseName;

public class CourseResponseDTO {
	private Long id;
	private CourseName course;
	private String description;
	private Instant createdAt = Instant.now();
	private int timeCourse;
	private AddressResponseDTO address;
	
	public CourseResponseDTO(Course entity) {
		this.id = entity.getId();
		this.course = entity.getCourse();
		this.description = entity.getDescription();
		this.createdAt = entity.getCreatedAt();
		this.timeCourse = entity.getTimeCourse();
	    this.setAddress(new AddressResponseDTO(entity.getAddress()));
	
	}

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

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public int getTimeCourse() {
		return timeCourse;
	}

	public void setTimeCourse(int timeCourse) {
		this.timeCourse = timeCourse;
	}

	public AddressResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseDTO address) {
		this.address = address;
	}

}
