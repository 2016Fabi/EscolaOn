package com.FI.EscolaOn.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProfessorDTO {
	private Long id;
	private String nome;
	private String endereco;
	private String senha;
	private String cpf;
	private String nivelDeAcesso;
	private List<Long> prova;
	
}
