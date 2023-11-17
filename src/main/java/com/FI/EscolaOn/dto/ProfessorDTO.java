package com.FI.EscolaOn.dto;

import java.time.LocalDateTime;
import com.FI.EscolaOn.entity.Professor;

import lombok.Data;

@Data
public class ProfessorDTO {
	private Long id; 
	private String nome;
	private String senha;
	private String cpf;
	private String nivelDeAcesso;
	private LocalDateTime dataDeCadastro;
	private EnderecoDTO endereco;
	
	public ProfessorDTO() {
		
	}
	
	public ProfessorDTO(Professor professor) {
		this.id = professor.getId();
		this.nome = professor.getNome();
		this.senha = professor.getSenha();
		this.cpf = professor.getCpf();
		this.nivelDeAcesso = professor.getNivelDeAcesso().toString();
		this.dataDeCadastro = professor.getDataDeCadastro();
	}
	
}
