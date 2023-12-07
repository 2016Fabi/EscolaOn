package com.FI.EscolaOn.service.impl;

import com.FI.EscolaOn.dto.request.StudentRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.StudentRegisterResponseDTO;
import com.FI.EscolaOn.mappers.entities.StudentMapper;
import com.FI.EscolaOn.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	public StudentRegisterResponseDTO register(StudentRegisterRequestDTO request) {
		return StudentMapper.fromStudent(repository.save(StudentMapper.fromStudentRegisterRequest(request)));
	}

//	public List<Student> findAll() {
//		return alunoRepository.findAll();
//	}
//
//	public void deletar(Long id) {
//		alunoRepository.deleteById(id);
//	}
//
//	public Student updateAluno(Student aluno, Long id) {
//		aluno.setId(id);
//		return alunoRepository.save(aluno);
//	}
//
//	public boolean existsBycpf(String cpf) {
//		return alunoRepository.existsBycpf(cpf);
//	}
//
//	public Student findById(Long id) {
//		Optional<Student> obj = alunoRepository.findById(id);
//		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id + ", Tipo: " + Student.class.getName(), obj));
//	}

}
