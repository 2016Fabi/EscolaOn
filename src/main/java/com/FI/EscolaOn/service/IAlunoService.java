package com.FI.EscolaOn.service;

import java.util.List;
import java.util.UUID;

import com.FI.EscolaOn.entity.Aluno;

public interface IAlunoService {
	public Aluno salvar(Aluno aluno);
	public List<Aluno> listar();
	public void deletar(UUID id);
	public Aluno updateAluno(Aluno aluno); 
}
