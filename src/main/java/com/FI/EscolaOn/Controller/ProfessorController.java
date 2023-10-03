package com.FI.EscolaOn.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FI.EscolaOn.Enuns.NivelAcesso;
import com.FI.EscolaOn.dto.ProfessorDTO;
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
	public ResponseEntity<Object> saveProfessor(@RequestBody @Valid ProfessorDTO professorDTO, HttpServletRequest request){
	   //Imilio
//		    var professor = new Professor();
//	        BeanUtils.copyProperties(professorDTO, professor);
//	        if(!professorDTO.getNivelDeAcesso().equals("aluno")){
//				System.out.println("Para esta Requisição só é possivel aluno como n");
//	        } else if (professorDTO.getNivelDeAcesso().equals("aluno")) {
//	            professor.setNivelDeAcesso(NivelAcesso.ALUNO);
//	        }else {
//	            return ResponseEntity.status(HttpStatus.CONFLICT).body("Este nível de Acesso não existe");
//	        }
//	        professor.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
//	        return ResponseEntity.status(HttpStatus.CREATED).body(professorService.save(professor)); 
		
		Professor professor = new Professor();
	    professor.setNome(professorDTO.getNome());
	    professor.setEndereco(professorDTO.getEnderero());
	    professor.setSenha(professorDTO.getSenha());
	    professor.setCpf(professorDTO.getCpf());
	    professor.setNivelDeAcesso(NivelAcesso.PROFESSOR);
	    professor.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
	    professor = professorService.save(professor);
		return new ResponseEntity<>(professor, HttpStatus.OK);
	}
	

}
