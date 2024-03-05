package com.FI.EscolaOn.service;

import java.util.List;
//import java.util.Optional;

//import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.dto.request.TeacherRequestDTO;
import com.FI.EscolaOn.dto.response.TeacherResponseDTO;
import com.FI.EscolaOn.mappers.entities.TeacherMapper;
import com.FI.EscolaOn.repository.TeacherRepository;


@Service
public class TeacherService{
	
	@Autowired
	private TeacherRepository repository;
	
	public TeacherResponseDTO register(TeacherRequestDTO request) {
		return TeacherMapper.fromTeacher(repository.save(TeacherMapper.fromTeacherRegisterRequest(request)));
	}

	public List<TeacherResponseDTO> findAll() {
		return repository.findAll().stream().map(TeacherResponseDTO::new).toList();
	}

//	public void deletar(Long id) {
//		teacherRepository.deleteById(id);
//	}
//
//	public Teacher updateTeacher(Teacher teacher, Long id) {
//		teacher.setId(id);
//		return teacherRepository.save(teacher);
//	}
//	
//	public Teacher findById(Long id) {
//		Optional<Teacher> obj = teacherRepository.findById(id);
//		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id + ", Tipo: " + Teacher.class.getName(), obj));
//	}

}
