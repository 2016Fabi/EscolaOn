package com.FI.EscolaOn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FI.EscolaOn.dto.ProfessorDTO;
import com.FI.EscolaOn.service.impl.ProfessorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Professor")
@CrossOrigin(origins = "*")
public class ProfessorController {
	
	@Autowired
	ProfessorService professorService;
	
	@PostMapping
	public ResponseEntity<Object> saveProfessor(@RequestBody @Valid ProfessorDTO professorDTO){
		 return null;   			
	}
	

}
