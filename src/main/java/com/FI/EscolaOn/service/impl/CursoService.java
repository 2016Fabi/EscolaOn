package com.FI.EscolaOn.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
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

	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	public void deletar(Long id) {
		cursoRepository.deleteById(id);
	}

	public Curso updateCurso(Curso curso, Long id) {
		curso.setId(id);
		return cursoRepository.save(curso);
	}

	public Curso findById(Long id) {
		Optional<Curso> obj = cursoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id + ", Tipo: " + Curso.class.getName(), obj));
	}
}
