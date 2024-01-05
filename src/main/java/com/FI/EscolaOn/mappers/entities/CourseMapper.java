package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.CourseRegisterResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.CourseBuilder;
import com.FI.EscolaOn.dto.request.CourseRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.CourseRegisterResponseDTO;
import com.FI.EscolaOn.entity.Course;

public class CourseMapper {
	public static Course fromCourseRegisterRequest(CourseRegisterRequestDTO request) {
		return CourseBuilder.builder()
				.course(request.getCourse())
				.description(request.getDescription())
				.timeCourse(request.getTimeCourse())
				.address(AddressMapper.fromAddressRegisterRequest(request.getAddress()))
				.build();		
	}
	public static CourseRegisterResponseDTO fromCourse(Course entity) {
		return CourseRegisterResponseDTOBuilder.builder()
				.course(entity.getCourse())
				.description(entity.getDescription())
				.timeCourse(entity.getTimeCourse())
				.address(entity.getAddress())
				.build();		
	}
}
