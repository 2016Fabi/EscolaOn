package com.FI.EscolaOn.dto;

import java.time.LocalDateTime;

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
}
