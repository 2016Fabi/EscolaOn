package com.FI.EscolaOn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository;

	public Aluno save(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	public List<Aluno> listarAluno() {
		return alunoRepository.findAll();
	}

	public void deletar(Long id) {
		alunoRepository.deleteById(id);
	}

	public Aluno updateAluno(Aluno aluno, Long id) {
		return alunoRepository.save(aluno);
	}

	public boolean existsBycpf(String cpf) {
		return alunoRepository.existsBycpf(cpf);
	}

	public Aluno findById(Long id) {
		return alunoRepository.findById(id).get();
	}

}
