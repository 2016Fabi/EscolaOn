package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.service.impl.AlunoService;
import com.FI.EscolaOn.service.impl.CursoService;
import com.FI.EscolaOn.service.impl.EnderecoService;
import com.FI.EscolaOn.Enuns.NivelAcesso;
import com.FI.EscolaOn.dto.AlunoDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Aluno")
@CrossOrigin(origins = "*")
public class AlunoController {

	@Autowired
	AlunoService alunoService;
	
	@Autowired
	EnderecoService enderecoService;
	
	@Autowired
	CursoService cursoService;

	@PostMapping
	public ResponseEntity<Aluno> saveAluno(@RequestBody @Valid AlunoDTO alunoDTO, HttpServletRequest request) {

		Aluno aluno = new Aluno();
		aluno.setNome(alunoDTO.getNome());
		aluno.setSenha(alunoDTO.getSenha());
		aluno.setCpf(alunoDTO.getCpf());
		aluno.setEmail(alunoDTO.getEmail());
		aluno.setNiveldeacesso(NivelAcesso.valueOf(alunoDTO.getNiveldeacesso().toUpperCase()));
		aluno.setDataDeCadastro(LocalDateTime.now(ZoneId.of("UTC")));
		aluno.setCurso(alunoDTO.getCurso());
		
		Long enderecoId = alunoDTO.getEnderecoId();

		Endereco end = null;

		try {
			end = enderecoService.findById(enderecoId);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		aluno.setEndereco(end);
		
		
		aluno = alunoService.save(aluno);
		return new ResponseEntity<>(aluno, HttpStatus.OK);

	}

	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@GetMapping("/listar")
//	public ResponseEntity<List<AlunoDTO>> listar() {
//		List listaAluno = this.alunoService.findAll();
//		return new ResponseEntity<>(listaAluno, HttpStatus.OK);
//	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<AlunoDTO>> listar() {
	  List<AlunoDTO> listaAluno = this.alunoService.findAll().stream().map(AlunoDTO::new).collect(Collectors.toList());
	  return new ResponseEntity<>(listaAluno, HttpStatus.OK);
	}

	@PutMapping("/updateAluno/{id}")
	public Aluno updateAluno(@RequestBody Aluno aluno, @PathVariable Long id) throws Exception {
		Aluno alun = alunoService.findById(id);
		alun.setNome(aluno.getNome());
		alun.setSenha(aluno.getSenha());
		alun.setCpf(aluno.getCpf());
		alun.setEmail(aluno.getEmail());
		return alunoService.updateAluno(alun, id);
	}

	@DeleteMapping("/deleteAluno/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		alunoService.deletar(id);
	}

}
