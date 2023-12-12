package com.FI.EscolaOn.builders.entities;

import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.entity.Course;
import com.FI.EscolaOn.enums.CourseName;

public class CourseBuilder {
	private Course entity;

	private CourseBuilder() {
		this.entity = new Course();
	}
	
	public static CourseBuilder builder() {
		return new CourseBuilder();
	}
	
	public Course build() {
		return this.entity;
	}
	
	public CourseBuilder course(CourseName course) {
		this.entity.setCourse(course);
		return this;
	}
	
	public CourseBuilder description(String description) {
		this.entity.setDescription(description);
		return this;
	}
	
	public CourseBuilder timeCourse(int timeCourse) {
		this.entity.setTimeCourse(timeCourse);
		return this;
	}
	
	public CourseBuilder address(Address address) {
		this.entity.setAddress(address);
		return this;
	}
	
	
}
