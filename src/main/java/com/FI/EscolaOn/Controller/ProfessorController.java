package com.FI.EscolaOn.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

//import org.springframework.beans.BeanUtils;
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
import com.FI.EscolaOn.entity.Professor;
import com.FI.EscolaOn.service.impl.ProfessorService;
import com.FI.EscolaOn.service.impl.ProvaService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Professor")
@CrossOrigin(origins = "*")
public class ProfessorController {
	
	@Autowired
	ProfessorService professorService;
	@Autowired
	ProvaService provaService;

@PostMapping
public ResponseEntity<Object> saveProfessor(@RequestBody @Valid ProfessorDTO professorDTO, HttpServletRequest request) {
    Professor professor = new Professor();
    professor.setNome(professorDTO.getNome());
    professor.setSenha(professorDTO.getSenha());
    professor.setCpf(professorDTO.getCpf());
    professor.setNivelDeAcesso(NivelAcesso.PROFESSOR);
    professor.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
    professor = professorService.save(professor);
    return new ResponseEntity<>(professor, HttpStatus.OK);
}


	@GetMapping
	public ResponseEntity<List<Professor>> listar() {
		List<Professor> listaProfessor = this.professorService.listar();
		return new ResponseEntity<>(listaProfessor, HttpStatus.OK);
	}
	
	 @PutMapping("/updateProfessor/{id}")
		public Professor updateProfessor(@RequestBody Professor professor, @PathVariable Long id) throws Exception {
			return professorService.updateProfessor(professor,id); 		
		}
	    
		@DeleteMapping("/deleteProfessor/{id}")
		public void deleteById(@PathVariable ("id") Long id) {
			professorService.deletar(id);
		}

}