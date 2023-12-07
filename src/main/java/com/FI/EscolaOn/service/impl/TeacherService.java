package com.FI.EscolaOn.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.entity.Teacher;
import com.FI.EscolaOn.repository.TeacherRepository;


@Service
public class TeacherService{
	
	@Autowired
	TeacherRepository teacherRepository;

	public Teacher save(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public List<Teacher> findAll() {
		return teacherRepository.findAll();
	}

	public void deletar(Long id) {
		teacherRepository.deleteById(id);
	}

	public Teacher updateTeacher(Teacher teacher, Long id) {
		teacher.setId(id);
		return teacherRepository.save(teacher);
	}
	
	public Teacher findById(Long id) {
		Optional<Teacher> obj = teacherRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id + ", Tipo: " + Teacher.class.getName(), obj));
	}

}
