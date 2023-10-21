package com.FI.EscolaOn.dto;

import com.FI.EscolaOn.entity.Curso;
import com.FI.EscolaOn.entity.Endereco;

import lombok.Data;

@Data
public class ProfessorDTO {
	private Long id;
	private String nome;
	private String senha;
	private String cpf;
	private String nivelDeAcesso;
	private Endereco endereco;
	private Curso curso;
}
