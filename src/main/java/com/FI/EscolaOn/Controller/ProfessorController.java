package com.FI.EscolaOn.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.Collectors;

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
import com.FI.EscolaOn.dto.EnderecoDTO;
import com.FI.EscolaOn.dto.ProfessorDTO;
import com.FI.EscolaOn.dto.ProfessorDTOResponse;
//import com.FI.EscolaOn.entity.Endereco;
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
	public ResponseEntity<ProfessorDTOResponse> saveProfessor(@RequestBody @Valid ProfessorDTO professorDTORequest, HttpServletRequest request) {
		Professor professor = new Professor();
		
		EnderecoDTO endereco = new EnderecoDTO();
		
		professor.setNome(professorDTORequest.getNome());
		professor.setSenha(professorDTORequest.getSenha());
		professor.setCpf(professorDTORequest.getCpf());
		professor.setNivelDeAcesso(NivelAcesso.valueOf(professorDTORequest.getNivelDeAcesso().toUpperCase()));
		professor.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
		
		endereco.setProvincia(professorDTORequest.getEndereco().getProvincia());
		endereco.setBairro(professorDTORequest.getEndereco().getBairro());
		endereco.setMunicipio(professorDTORequest.getEndereco().getMunicipio());
		endereco.setRua(professorDTORequest.getEndereco().getRua());
		
//		Endereco end1 = new Endereco(endereco);
//		end1 = enderecoService.save(end1);
//		professor.setEndereco(end1);
		
		professor = professorService.save(professor);
		
		ProfessorDTOResponse professorResponse = new ProfessorDTOResponse();
		professorResponse.setId(professor.getId());
		professorResponse.setNome(professor.getNome());
		professorResponse.setSenha(professor.getSenha());
		professorResponse.setCpf(professor.getCpf());
		professorResponse.setNivelDeAcesso(professor.getNivelDeAcesso().toString().toLowerCase());
		professorResponse.setDataDeCadastro(professor.getDataDeCadastro());
		professorResponse.setEndereco(endereco);
		
		
	    
	   
		return ResponseEntity.status(HttpStatus.CREATED).body(professorResponse);

	}
	
	@GetMapping
	public ResponseEntity<List<ProfessorDTOResponse>> findAll(@RequestBody @Valid ProfessorDTO professorDTORequest, HttpServletRequest request) {
		List<Professor> listaProfessor = this.professorService.findAll();
		List<ProfessorDTOResponse> listaProfessorResponse = listaProfessor.stream().map(professor -> {			
			EnderecoDTO endereco = new EnderecoDTO();
			
			endereco.setProvincia(professorDTORequest.getEndereco().getProvincia());
			endereco.setBairro(professorDTORequest.getEndereco().getBairro());
			endereco.setMunicipio(professorDTORequest.getEndereco().getMunicipio());
			endereco.setRua(professorDTORequest.getEndereco().getRua());


			ProfessorDTOResponse professorResponse = new ProfessorDTOResponse();
			professorResponse.setId(professor.getId());
			professorResponse.setNome(professor.getNome());
			professorResponse.setSenha(professor.getSenha());
			professorResponse.setCpf(professor.getCpf());
			professorResponse.setNivelDeAcesso(professor.getNivelDeAcesso().toString().toLowerCase());
			professorResponse.setDataDeCadastro(professor.getDataDeCadastro());
			professorResponse.setEndereco(endereco);
			
			return professorResponse;
		}).collect(Collectors.toList());

		return new ResponseEntity<>(listaProfessorResponse, HttpStatus.OK);
	}
	
	
//	public ResponseEntity<List<ProfessorDTO>> findAll() {
//		List<ProfessorDTO> professorDTO = new ArrayList<ProfessorDTO>();
//		professorDTO = professorService.findAll().stream().map(professor -> new ProfessorDTO(professor)).collect(Collectors.toList());
//		return ResponseEntity.ok().body(professorDTO);
//	}	

	@PutMapping("/updateProfessor/{id}")
	public Professor updateProfessor(@RequestBody Professor professor, @PathVariable Long id) throws Exception {
		return professorService.updateProfessor(professor, id);
	}

	@DeleteMapping("/deleteProfessor/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		professorService.deletar(id);
	}

}