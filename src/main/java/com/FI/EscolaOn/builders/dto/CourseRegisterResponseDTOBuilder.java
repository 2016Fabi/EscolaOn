package com.FI.EscolaOn.builders.dto;

import com.FI.EscolaOn.dto.response.AddressRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.CourseRegisterResponseDTO;
import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.enums.CourseName;

public class CourseRegisterResponseDTOBuilder {
	private CourseRegisterResponseDTO entity;
	
	public static CourseRegisterResponseDTOBuilder builder() {
		return new CourseRegisterResponseDTOBuilder();
	}

	public CourseRegisterResponseDTO build() {
		return this.entity;
	}

	public CourseRegisterResponseDTOBuilder id(Long id) {
		this.entity.setId(id);
		return this;
	}

	public CourseRegisterResponseDTOBuilder course(CourseName course) {
		this.entity.setCourse(course);
		return this;
	}

	public CourseRegisterResponseDTOBuilder description(String description) {
		this.entity.setDescription(description);
		return this;
	}
	
	public CourseRegisterResponseDTOBuilder timeCourse(int timeCourse) {
		this.entity.setTimeCourse(timeCourse);
		return this;
	}

	public CourseRegisterResponseDTOBuilder address(Address address) {
		this.entity.setAddress(new AddressRegisterResponseDTO(address));
		return this;
	}
}
