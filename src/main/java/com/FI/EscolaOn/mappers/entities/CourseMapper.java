package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.response.CourseResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.CourseBuilder;
import com.FI.EscolaOn.dto.request.CourseRequestDTO;
import com.FI.EscolaOn.dto.response.CourseResponseDTO;
import com.FI.EscolaOn.entity.Course;

public class CourseMapper {
	public static Course fromCourseRegisterRequest(CourseRequestDTO request) {
		return CourseBuilder.builder()
				.course(request.getCourse())
				.description(request.getDescription())
				.timeCourse(request.getTimeCourse())
				.address(AddressMapper.fromAddressRegisterRequest(request.getAddress()))
				.build();		
	}
	public static CourseResponseDTO fromCourse(Course entity) {
		return CourseResponseDTOBuilder.builder()
				.course(entity.getCourse())
				.description(entity.getDescription())
				.timeCourse(entity.getTimeCourse())
				.address(entity.getAddress())
				.build();		
	}
}
