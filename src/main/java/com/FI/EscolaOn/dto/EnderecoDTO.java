package com.FI.EscolaOn.dto;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Curso;
import com.FI.EscolaOn.entity.Professor;

import lombok.Data;

@Data
public class EnderecoDTO {
	private String provincia;
	private String municipio;
	private String bairro;
	private String rua;
	private Professor professor;
	private Aluno aluno;
	private Curso curso;
}
