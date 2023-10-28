package com.FI.EscolaOn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.entity.Professor;
import com.FI.EscolaOn.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository professorRepository;

	public Professor save(Professor professor) {
		return professorRepository.save(professor);
	}

	public List<Professor> listarProfessor() {
		return professorRepository.findAll();	
	}

	public void deletar(Long id) {
		professorRepository.deleteById(id);
	}

	public Professor updateProfessor(Professor professor, Long id) {
		return professorRepository.save(professor);
	}

	public Professor findById(Long id) {
		return professorRepository.findById(id).get();
	}

}
