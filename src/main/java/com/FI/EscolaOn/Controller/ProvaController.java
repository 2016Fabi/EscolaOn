package com.FI.EscolaOn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FI.EscolaOn.dto.ProvaDTO;
import com.FI.EscolaOn.entity.Prova;
import com.FI.EscolaOn.service.impl.ProvaService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Prova")
@CrossOrigin(origins = "*")
public class ProvaController {
	
	@Autowired
	ProvaService provaService;
	
	@PostMapping
	public ResponseEntity<Object> saveProva(@RequestBody @Valid ProvaDTO provaDTO, HttpServletRequest request){
		
		Prova prova = new Prova();
		prova.setNomeProva(provaDTO.getNomeProva());
		prova.setPerguntasProva(provaDTO.getPerguntasProva());
		prova.setVarianteProva(provaDTO.getVarianteProva());
		prova = provaService.save(prova);		
		return new ResponseEntity<>(prova, HttpStatus.OK);   	
	}

}
