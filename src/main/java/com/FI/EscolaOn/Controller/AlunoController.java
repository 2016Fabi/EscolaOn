package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.Enuns.NivelAcesso;
import com.FI.EscolaOn.service.impl.AlunoService;
import com.FI.EscolaOn.dto.AlunoDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
//import jakarta.validation.constraints.Email;
//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
@RequestMapping("/Aluno")
@CrossOrigin(origins = "*")
public class AlunoController {

	@Autowired
	AlunoService alunoService;

	@PostMapping
	public ResponseEntity<Object> saveAluno(@RequestBody @Valid AlunoDTO alunoDTO, HttpServletRequest request) {

		// Imilio
//    	var aluno = new Aluno();
//        if(alunoService.existsBycpf(alunoDTO.getCpf())){
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("O CPF já existe");
//        }
//        BeanUtils.copyProperties(alunoDTO, aluno);
//        aluno.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
//        aluno.setNiveldeacesso(NivelAcesso.ALUNO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(aluno));

		Aluno aluno = new Aluno();
		aluno.setNome(alunoDTO.getNome());
		aluno.setSenha(alunoDTO.getSenha());
		aluno.setCpf(alunoDTO.getCpf());
		aluno.setEmail(alunoDTO.getEmail());
		aluno.setNiveldeacesso(NivelAcesso.ALUNO);
		aluno.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
		aluno = alunoService.save(aluno);
		return new ResponseEntity<>(aluno, HttpStatus.OK);

	}

	@GetMapping
	public ResponseEntity<List<Aluno>> listar() {
		List<Aluno> listaAluno = this.alunoService.listar();
		return new ResponseEntity<>(listaAluno, HttpStatus.OK);
	}

	@PutMapping("/updateAluno/{id}")
	public Aluno updateAluno(@RequestBody Aluno aluno, @PathVariable Long id) throws Exception {
		return alunoService.updateAluno(aluno, id);
	}

	@DeleteMapping("/deleteAluno/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		alunoService.deletar(id);
	}

}
