package com.FI.EscolaOn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.entity.Curso;
import com.FI.EscolaOn.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	CursoRepository cursoRepository;

	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}

	public List<Curso> listar() {
		return cursoRepository.findAll();
	}

	public void deletar(Long id) {
		cursoRepository.deleteById(id);
	}

	public Curso updateCurso(Curso curso, Long id) {
		return cursoRepository.save(curso);
	}

	public Curso findById(Long id) {
		return cursoRepository.findById(id).get();
	}
}
