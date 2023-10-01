package com.FI.EscolaOn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FI.EscolaOn.dto.ProvaDTO;
import com.FI.EscolaOn.service.impl.ProvaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Prova")
@CrossOrigin(origins = "*")
public class ProvaController {
	
	@Autowired
	ProvaService provaService;
	
	@PostMapping
	public ResponseEntity<Object> saveProva(@RequestBody @Valid ProvaDTO provaDTO){
		return null;   	
	}

}
