package com.FI.EscolaOn.service;

import java.util.List;
//import java.util.Optional;

//import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.dto.request.TeacherRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.TeacherRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.TeacherResponseFindAllDTO;
import com.FI.EscolaOn.mappers.entities.TeacherMapper;
import com.FI.EscolaOn.repository.TeacherRepository;


@Service
public class TeacherService{
	
	@Autowired
	private TeacherRepository repository;
	
	public TeacherRegisterResponseDTO register(TeacherRegisterRequestDTO request) {
		return TeacherMapper.fromTeacher(repository.save(TeacherMapper.fromTeacherRegisterRequest(request)));
	}

	public List<TeacherResponseFindAllDTO> findAll() {
		return repository.findAll().stream().map(TeacherResponseFindAllDTO::new).toList();
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