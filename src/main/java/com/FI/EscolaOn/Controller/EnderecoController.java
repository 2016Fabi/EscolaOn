package com.FI.EscolaOn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.service.impl.EnderecoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Endereco")
@CrossOrigin(origins = "*")
public class EnderecoController {
	 
	@Autowired
	EnderecoService enderecoService;
	
	@PostMapping
	public ResponseEntity<Object> saveEndereco(@RequestBody @Valid Endereco endereco) {
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.save(endereco));
	}	

}
