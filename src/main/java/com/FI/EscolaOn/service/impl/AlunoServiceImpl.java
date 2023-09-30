package com.FI.EscolaOn.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.repository.AlunoRepository;
import com.FI.EscolaOn.service.IAlunoService;

public class AlunoServiceImpl implements IAlunoService{
    
	@Autowired
	AlunoRepository alunoRepository;
	
	@Override
	public Aluno salvar(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	@Override
	public List<Aluno> listar() {
		return alunoRepository.listar();
	}

	@Override
	public void deletar(UUID id) {
		alunoRepository.deleteById(id);
	}

	@Override
	public Aluno updateAluno(Aluno aluno) {
		return salvar(aluno);
	}

}
