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

//import com.FI.EscolaOn.Enuns.NivelAcesso;
import com.FI.EscolaOn.dto.ProfessorDTO;
import com.FI.EscolaOn.dto.ProfessorDTOResponse;
import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.entity.Professor;
import com.FI.EscolaOn.service.impl.ProfessorService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Professor")
@CrossOrigin(origins = "*")
public class ProfessorController {

	@Autowired
	ProfessorService professorService;

	@PostMapping
	public ResponseEntity<Object> saveProfessor(@RequestBody @Valid ProfessorDTO professorDTORequest, HttpServletRequest request) {
		Professor professor = new Professor();
		
		Endereco endereco = new Endereco();
		
		professor.setNome(professorDTORequest.getNome());
		professor.setSenha(professorDTORequest.getSenha());
		professor.setCpf(professorDTORequest.getCpf());
		professor.setNivelDeAcesso(professorDTORequest.getNivelDeAcesso());
		professor.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
		
		endereco.setProvincia(professorDTORequest.getEndereco().getProvincia());
		endereco.setBairro(professorDTORequest.getEndereco().getBairro());
		endereco.setMunicipio(professorDTORequest.getEndereco().getMunicipio());
		endereco.setRua(professorDTORequest.getEndereco().getRua());
		
		ProfessorDTOResponse professorResponse = new ProfessorDTOResponse();
		
		professor.setEndereco(endereco);
		professor = professorService.save(professor);
		
	    professorResponse.setId(professor.getId());
		professorResponse.setNome(professor.getNome());
		professorResponse.setSenha(professor.getSenha());
		professorResponse.setCpf(professor.getCpf());
		professorResponse.setNivelDeAcesso(professorDTORequest.getNivelDeAcesso());
	   
		
		return new ResponseEntity<>(professorResponse, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Professor>> listar() {
		List<Professor> listaProfessor = this.professorService.listar();
		return new ResponseEntity<>(listaProfessor, HttpStatus.OK);
	}

	@PutMapping("/updateProfessor/{id}")
	public Professor updateProfessor(@RequestBody Professor professor, @PathVariable Long id) throws Exception {
		return professorService.updateProfessor(professor, id);
	}

	@DeleteMapping("/deleteProfessor/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		professorService.deletar(id);
	}

}