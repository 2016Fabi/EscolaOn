package com.FI.EscolaOn.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class PessoaDTO {
	private UUID id;
	private String nome;
	private String enderero;
	private String senha;
	private String cpf;
	private String niveldeacesso;
}
