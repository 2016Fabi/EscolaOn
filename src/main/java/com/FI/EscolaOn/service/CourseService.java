package com.FI.EscolaOn.service;

import java.util.List;
//import java.util.Optional;

//import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.dto.request.CourseRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.CourseRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.CourseResponseFindAllDTO;
import com.FI.EscolaOn.mappers.entities.CourseMapper;
import com.FI.EscolaOn.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	public CourseRegisterResponseDTO register(CourseRegisterRequestDTO request) {
		return CourseMapper.fromCourse(repository.save(CourseMapper.fromCourseRegisterRequest(request)));
	}

	public List<CourseResponseFindAllDTO> findAll() {
		return repository.findAll().stream().map(CourseResponseFindAllDTO::new).toList();
	}

//	public void deletar(Long id) {
//		courseRepository.deleteById(id);
//	}
//
//	public Course updateCourso(Course course, Long id) {
//		course.setId(id);
//		return courseRepository.save(course);
//	}
//
//	public Course findById(Long id) {
//		Optional<Course> obj = courseRepository.findById(id);
//		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id + ", Tipo: " + Course.class.getName(), obj));
//	}
}