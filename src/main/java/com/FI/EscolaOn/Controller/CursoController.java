package com.FI.EscolaOn.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FI.EscolaOn.dto.CursoDTO;
import com.FI.EscolaOn.entity.Curso;
import com.FI.EscolaOn.service.impl.AlunoService;
import com.FI.EscolaOn.service.impl.CursoService;
import com.FI.EscolaOn.service.impl.ProvaService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Curso")
@CrossOrigin(origins = "*")
public class CursoController {

	@Autowired
	CursoService cursoService;
	@Autowired
	AlunoService alunoService;	
	@Autowired
	ProvaService provaService;	

	@PostMapping
	public ResponseEntity<Object> saveCurso(@RequestBody @Valid CursoDTO cursoDTO, HttpServletRequest request) {
		Curso curso = new Curso();
		curso.setCurso(cursoDTO.getCurso());
		curso.setDescricao(cursoDTO.getDescricao());
		curso.setDataCadastroCurso(LocalDateTime.now(ZoneId.of("UTC")));
		curso.setTempoAula(cursoDTO.getCargaHoraria());
		
//		List<Prova> provas = cursoDTO.getProva().stream().map(prova ->  provaService.findById(prova)).toList();
//		curso.setProva(provas);
		
		curso = cursoService.save(curso);
		return new ResponseEntity<>(curso, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Curso>> listar(){
		List<Curso> listaCurso = this.cursoService.findAll();
		return new ResponseEntity<>(listaCurso, HttpStatus.OK);
	}
	
	@PutMapping("/updateCurso/{id}")
	public Curso updateCurso(@RequestBody Curso curso, @PathVariable Long id) throws Exception { 
		return cursoService.updateCurso(curso, id);
	}
	
	@DeleteMapping("/deleteCurso/{id}")
	public void deleteById(@PathVariable ("id") Long id) {
		cursoService.deletar(id);
	}

}
