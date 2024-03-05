package com.FI.EscolaOn.builders.dto.response;

import com.FI.EscolaOn.dto.response.AddressResponseDTO;
import com.FI.EscolaOn.dto.response.CourseResponseDTO;
import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.enums.CourseName;

public class CourseResponseDTOBuilder {
	private CourseResponseDTO entity;
	
	public static CourseResponseDTOBuilder builder() {
		return new CourseResponseDTOBuilder();
	}

	public CourseResponseDTO build() {
		return this.entity;
	}

	public CourseResponseDTOBuilder id(Long id) {
		this.entity.setId(id);
		return this;
	}

	public CourseResponseDTOBuilder course(CourseName course) {
		this.entity.setCourse(course);
		return this;
	}

	public CourseResponseDTOBuilder description(String description) {
		this.entity.setDescription(description);
		return this;
	}
	
	public CourseResponseDTOBuilder timeCourse(int timeCourse) {
		this.entity.setTimeCourse(timeCourse);
		return this;
	}

	public CourseResponseDTOBuilder address(Address address) {
		this.entity.setAddress(new AddressResponseDTO(address));
		return this;
	}
}
