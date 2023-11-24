package com.FI.EscolaOn.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
//import java.util.ArrayList;
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

import com.FI.EscolaOn.Enuns.NivelAcesso;
import com.FI.EscolaOn.dto.ProfessorDTO;
import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.entity.Professor;
import com.FI.EscolaOn.service.impl.EnderecoService;
import com.FI.EscolaOn.service.impl.ProfessorService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Professor")
@CrossOrigin(origins = "*")
public class ProfessorController {

	@Autowired
	ProfessorService professorService;
	
	@Autowired
	EnderecoService enderecoService;
	

	@PostMapping
	public ResponseEntity<Professor> saveProfessor(@RequestBody @Valid ProfessorDTO professorDTORequest, HttpServletRequest request) {
		Professor professor = new Professor();
				
		professor.setNome(professorDTORequest.getNome());
		professor.setSenha(professorDTORequest.getSenha());
		professor.setCpf(professorDTORequest.getCpf());
		professor.setNivelDeAcesso(NivelAcesso.valueOf(professorDTORequest.getNivelDeAcesso().toUpperCase()));
		professor.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));		
				
		Long enderecoId = professorDTORequest.getEnderecoId();
		
		Endereco end = null;
				
		try {
		 end = enderecoService.findById(enderecoId);			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		professor.setEndereco(end);
		professor = professorService.save(professor);
				
		 	   
		return new ResponseEntity<>(professor, HttpStatus.OK);

	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/listar")
	public ResponseEntity<List<ProfessorDTO>> listar() {		
		List listaProfessor = this.professorService.findAll();		
		return new ResponseEntity<>(listaProfessor, HttpStatus.OK);
	}
	

	@PutMapping("/updateProfessor/{id}")
	public Professor updateProfessor(@RequestBody Professor professor, @PathVariable Long id) throws Exception {
		Professor prof = professorService.findById(id);
		prof.setNome(professor.getNome());
		prof.setSenha(professor.getSenha());
		prof.setCpf(professor.getCpf());
		return professorService.updateProfessor(prof, id);
	}

	@DeleteMapping("/deleteProfessor/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		professorService.deletar(id);
	}

}