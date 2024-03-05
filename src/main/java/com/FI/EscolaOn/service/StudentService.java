package com.FI.EscolaOn.service;

import com.FI.EscolaOn.dto.request.StudentRequestDTO;
import com.FI.EscolaOn.dto.response.StudentResponseDTO;
import com.FI.EscolaOn.entity.Student;
import com.FI.EscolaOn.mappers.entities.StudentMapper;
import com.FI.EscolaOn.repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public StudentResponseDTO register(StudentRequestDTO request) {
		return StudentMapper.fromStudent(repository.save(StudentMapper.fromStudentRegisterRequest(request)));
	}

	public List<StudentResponseDTO> findAll() {
		return repository.findAll().stream().map(StudentResponseDTO::new).toList();
	}
	
	public StudentResponseDTO update(Long id, StudentRequestDTO request) {
		Student existingStudent = repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado com ID: " + id));
		
		 existingStudent.setName(request.getName());
		 existingStudent.setEmail(request.getEmail());
		 existingStudent.setRoleName(request.getRole());
		
		return StudentMapper.fromStudent(repository.save(existingStudent));
    	
    }
	
	
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
