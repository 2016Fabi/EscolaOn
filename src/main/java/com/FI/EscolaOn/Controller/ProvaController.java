package com.FI.EscolaOn.Controller;

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
	public ResponseEntity<Object> saveProva(@RequestBody @Valid ProvaDTO provaDTO, HttpServletRequest request) {

		Prova prova = new Prova();

		if (provaDTO.getPerguntasProva().size() <= 100) {
			prova.setPerguntasProva(provaDTO.getPerguntasProva());
		} else {
			throw new RuntimeException("Quantidades de questões não pode ser maior que 10.");
		}

		prova.setNomeProva(provaDTO.getNomeProva());
		prova.setVarianteProva(provaDTO.getVarianteProva());
		prova = provaService.save(prova);
		return new ResponseEntity<>(prova, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Prova>> listar() {
		List<Prova> listaProva = this.provaService.listar();
		return new ResponseEntity<>(listaProva, HttpStatus.OK);
	}

	@PutMapping("/updateProva/{id}")
	public Prova updateProva(@RequestBody Prova prova, @PathVariable Long id) throws Exception {
		return provaService.updateProva(prova, id);
	}

	@DeleteMapping("/deleteProva/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		provaService.deletar(id);
	}

}
