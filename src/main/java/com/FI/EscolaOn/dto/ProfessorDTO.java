package com.FI.EscolaOn.dto;

import lombok.Data;

@Data
public class ProfessorDTO {
	private Long id; 
	private String nome;
	private String senha;
	private String cpf;
	private String nivelDeAcesso;
	private EnderecoDTO endereco;
}
