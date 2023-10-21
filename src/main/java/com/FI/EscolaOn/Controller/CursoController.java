package com.FI.EscolaOn.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FI.EscolaOn.dto.CursoDTO;
import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Curso;
import com.FI.EscolaOn.service.impl.AlunoService;
import com.FI.EscolaOn.service.impl.CursoService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Curso")
public class CursoController {

	@Autowired
	CursoService cursoService;
	
	@Autowired
	AlunoService alunoService;

	@PostMapping
	public ResponseEntity<Object> saveCurso(@RequestBody @Valid CursoDTO cursoDTO, HttpServletRequest request) {
		Curso curso = new Curso();
		curso.setCurso(cursoDTO.getCurso());
		curso.setDescricao(cursoDTO.getDescricao());
		curso.setDataCadastroCurso(LocalDateTime.now(ZoneId.of("UTC")));
		curso.setTempoAula(cursoDTO.getCargaHoraria());
		
		List<Aluno> alunos = new ArrayList<>();
		for(Long alunoId : cursoDTO.getAluno()) {
			Aluno aluno = alunoService.findById(alunoId);
			if(aluno != null) {
				alunos.add(aluno);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno com ID " + alunoId + " não encontrada.");
			}
		}
		
		
		
		
		curso = cursoService.save(curso);
		return new ResponseEntity<>(curso, HttpStatus.OK);
	}

}
