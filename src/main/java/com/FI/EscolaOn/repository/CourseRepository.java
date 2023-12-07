package com.FI.EscolaOn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FI.EscolaOn.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
