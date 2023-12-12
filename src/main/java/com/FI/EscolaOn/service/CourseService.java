package com.FI.EscolaOn.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.entity.Course;
import com.FI.EscolaOn.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	public Course save(Course course) {
		return courseRepository.save(course);
	}

	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	public void deletar(Long id) {
		courseRepository.deleteById(id);
	}

	public Course updateCourso(Course course, Long id) {
		course.setId(id);
		return courseRepository.save(course);
	}

	public Course findById(Long id) {
		Optional<Course> obj = courseRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id + ", Tipo: " + Course.class.getName(), obj));
	}
}
